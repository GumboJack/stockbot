import entities.ScopeCoins;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseManager {

    public static void initializeDatabase(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.rft2.groupB");

        ScopeCoins btc = new ScopeCoins();
        btc.setId("BTC");
        btc.setName("Bitcoin");

        ScopeCoins eth = new ScopeCoins();
        eth.setId("ETH");
        eth.setName("Ethereum");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManagerFactory.close();
    }
}
