package manager;


import entities.Coin;
import entities.Data;
import entities.ScopeCoins;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.sql.Connection;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseManager {

    private static final Logger logger = Logger.getLogger(DatabaseManager.class.getName());

    private String persistence = null;
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
                    "id SERIAL PRIMARY KEY," +
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

    @Transactional
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

    @Transactional
    public Map<Coin, List<Data>> getData(List<Coin> coins){
        Map<Coin, List<Data>> coinData = new HashMap<>();

        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try{
            entityManagerFactory = Persistence.createEntityManagerFactory(persistence);
            entityManager = entityManagerFactory.createEntityManager();

            entityManager.getTransaction().begin();
            for (Coin coin :
                    coins) {
                String queryString = "SELECT COUNT(id) FROM ScopeCoins WHERE id = :id";
                Long count = (Long)(entityManager.createQuery(queryString)
                        .setParameter("id", coin.getCoinId())
                        .getSingleResult());
                if (count > 0){
                    String queryString2 = "SELECT * FROM " + coin.getCoinId() + "_data";
                    List<Object[]> list = entityManager.createNativeQuery(queryString2).getResultList();
                    List<Data> listData = new ArrayList<>();
                    for (Object[] o:
                         list) {
                        listData.add(new Data((Timestamp) o[1], (Float) o[2]));
                    }
                    coinData.put(coin, listData);
                    logger.log(Level.INFO, String.format("Coin data collected %s (%s): %s record",
                            coin.getCoinId(),
                            coin.getCoinName(),
                            listData.size()));
                } else {
                    logger.log(Level.WARNING, String.format("Coin %s (%s) not in the scope",
                            coin.getCoinId(),
                            coin.getCoinName()));
                }
            }
            entityManager.getTransaction().commit();
        } catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e);
        } finally {
            if (entityManagerFactory != null){
                entityManagerFactory.close();
            }
        }

        return coinData;
    }

}
