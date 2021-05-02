package manager;


import entities.Coin;
import entities.Data;
import entities.ScopeCoins;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseManager {

    private static final Logger logger = Logger.getLogger(DatabaseManager.class.getName());

    private String persistence = null;
    private Connection connection = null;
    private static DatabaseManager dbManager = null;

    public static DatabaseManager getInstance(String persistence){
        if (dbManager == null){
            dbManager = new DatabaseManager();
        }
        dbManager.persistence = persistence;
        return dbManager;
    }


    @Transactional
    public void addNewCoin(Coin coin){
        ScopeCoins newCoin = new ScopeCoins();
        newCoin.setId(coin.getCoinId());
        newCoin.setName(coin.getCoinName());

        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(persistence);
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(newCoin);
            String query = "CREATE TABLE " + coin.getCoinId() + "_data ("+
                    "id SERIAL PRIMARY KEY" +
                    "date TIMESTAMP NOT NULL," +
                    "price_usd REAL)";
            entityManager.createNativeQuery(query).executeUpdate();
            entityManager.getTransaction().commit();
            logger.log(Level.INFO, String.format("New coin addded to scope: %s (%s)", coin.getCoinId(), coin.getCoinName()));
        } catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e);
        } finally {
            if (entityManagerFactory != null){
                entityManagerFactory.close();
            }
        }
    }

    @Transactional
    public void removeCoin(Coin coin){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(persistence);
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            String query = "DELETE FROM ScopeCoins WHERE id = :id";
            entityManager.createQuery(query)
                    .setParameter("id", coin.getCoinId())
                    .executeUpdate();
            String query2 = "DROP TABLE " + coin.getCoinId() + "_data";
            entityManager.createNativeQuery(query2).executeUpdate();
            logger.log(Level.INFO, String.format("Coin removed from scope: %s (%s)", coin.getCoinId(), coin.getCoinName()));
            entityManager.getTransaction().commit();

        } catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e);
        } finally {
            if (entityManagerFactory != null){
                entityManagerFactory.close();
            }
        }
    }

    public void insertData(Coin coin, Data record){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(persistence);
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            //CoinTableHelper.insertData(coin, record, entityManager.unwrap(Session.class));
            String query = "INSERT INTO " + coin.getCoinId() + "_data("+
                    "date, price_usd)" +
                    "VALUES ( :date, :price)";
            entityManager.createNativeQuery(query)
                    .setParameter("date", record.getTimestamp())
                    .setParameter("price", record.getPriceUSD())
                    .executeUpdate();
            entityManager.getTransaction().commit();
            logger.log(Level.INFO, String.format("new coin addded to scope: %s (%s)", coin.getCoinId(), coin.getCoinName()));
        } catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e);
        } finally {
            if (entityManagerFactory != null){
                entityManagerFactory.close();
            }
        }
    }

}
