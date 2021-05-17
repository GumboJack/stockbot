package client;

import util.PropReader;

import java.io.FileNotFoundException;
import java.util.Properties;

public abstract class Client {
    protected String completeURL = null;
    protected String apiKey = null;

    protected Client() {

    }

    public void setConfig(String configFile) {
        Properties properties = new PropReader().getPropValues(configFile);
        completeURL = new StringBuilder().append(properties.getProperty("api.baseUrl"))
                .append(properties.getProperty("api.endpoint")).toString();
        apiKey = properties.getProperty("api.key");
    }

}
