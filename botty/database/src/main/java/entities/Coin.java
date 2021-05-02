package entities;

public class Coin {
    private String coinId;
    private String coinName;

    public Coin(String coinId, String coinName) {
        this.coinId = coinId;
        this.coinName = coinName;
    }

    public String getCoinId() {
        return coinId;
    }

    public void setCoinId(String coinId) {
        this.coinId = coinId;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }
}
