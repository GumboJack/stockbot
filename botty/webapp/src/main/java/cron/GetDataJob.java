package cron;

import client.Client;
import client.ClientFactory;
import client.ClientType;
import client.LunarClient;
import entities.Coin;
import entities.Data;
import manager.DatabaseManager;
import org.json.JSONArray;
import org.json.JSONObject;
import org.quartz.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetDataJob implements Job, InterruptableJob {
    private static final Logger logger = Logger.getLogger(GetDataJob.class.getName());

    private Thread thread;

    @Override
    public void interrupt() throws UnableToInterruptJobException {
        thread.interrupt();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new UnableToInterruptJobException(e);
        }
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("================Running data getter job================");

        Client client = null;
        try {
            client = ClientFactory.makeClient(ClientType.LUNARCRUSH);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        client.setConfig("lunarcrush-api-config.properties");
        DatabaseManager dbManager = DatabaseManager.getInstance("org.hibernate.cryptoconfig");

        try {
            thread = Thread.currentThread();
            List<Coin> scopeList = new ArrayList<>();
            scopeList = dbManager.getAllCoins();

            for (Coin c :
                    scopeList) {
                JSONObject response = null;
                response = ((LunarClient) client).callAssets(c.getCoinId());
                System.out.println("response: " + response);

                if (response != null) {
                    JSONArray data = response.has("data") ? response.getJSONArray("data") : null;
                    Float price = data.getJSONObject(0).getFloat("price");
                    if (data != null && price != null){
                        dbManager.insertData(c, new Data(
                                new Timestamp(System.currentTimeMillis()),
                                price
                        ));
                        System.out.println("Price inserted: " + c.getCoinId() + " - " + price);
                    }
                }
            }
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
    }
}
