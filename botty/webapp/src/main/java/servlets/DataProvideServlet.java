package servlets;

import client.Client;
import client.ClientFactory;
import client.ClientType;
import entities.Coin;
import entities.Data;
import manager.DatabaseManager;
import org.json.JSONArray;
import org.json.JSONObject;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataProvideServlet extends HttpServlet {

    private static Logger logger = Logger.getLogger(DataProvideServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        JSONObject res = new JSONObject();

        try {
            Client client = ClientFactory.makeClient(ClientType.LUNARCRUSH);
            client.setConfig("lunarcrush-api-config.properties");
            DatabaseManager dbManager = DatabaseManager.getInstance("org.hibernate.cryptoconfig");

            List<Coin> scopeList = dbManager.getAllCoins();
            Map<Coin, List<Data>> coinDatas = dbManager.getData(scopeList);

            JSONArray charts = new JSONArray();

            for (Coin coin:
                 coinDatas.keySet()) {
                JSONArray chart = new JSONArray();

                for (Data data:
                        coinDatas.get(coin)) {
                    chart.put(data.getPriceUSD() * 1000);
                }

                charts.put(new JSONObject()
                        .put("name", coin.getCoinName())
                        .put("chart", chart));
            }

            res.put("charts", charts);
            res.put("error", 0);
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e);
            res.put("error", 1);
        } finally {
            out.println(res);
        }
    }
}
