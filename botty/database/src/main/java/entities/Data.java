package entities;

import java.sql.Timestamp;

public class Data {
    private Timestamp timestamp;
    private Float priceUSD;

    public Data(Timestamp timestamp, Float priceUSD) {
        this.timestamp = timestamp;
        this.priceUSD = priceUSD;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Float getPriceUSD() {
        return priceUSD;
    }

    public void setPriceUSD(Float priceUSD) {
        this.priceUSD = priceUSD;
    }
}
