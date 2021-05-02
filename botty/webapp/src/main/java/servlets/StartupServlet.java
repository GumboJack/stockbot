package servlets;

import entities.Coin;
import entities.Data;
import manager.DatabaseManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.sql.Timestamp;

public class StartupServlet extends HttpServlet{
    @Override
    public void init() throws ServletException {
        DatabaseManager dbManager = DatabaseManager.getInstance("org.hibernate.cryptoconfig");
        Coin btc = new Coin("BTC", "Bitcoin");
        Coin eth = new Coin("ETH", "Ethereum");
        dbManager.addNewCoin(btc);
        dbManager.addNewCoin(eth);
        dbManager.insertData(btc, new Data(new Timestamp(System.currentTimeMillis()), 53412.11f));
    }
}
