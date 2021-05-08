package client;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LunarClient extends Client {
    private static Logger logger = Logger.getLogger(LunarClient.class.getName());

    public JSONObject callAssets(String coinId) {
        JSONObject result = null;
        URI uri = null;

        try {
            uri = new URIBuilder(completeURL).addParameter("key", apiKey).addParameter("data", "assets")
                    .addParameter("symbol", coinId).build();
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }

        if (uri != null) {
            HttpGet request = new HttpGet(uri);
            try (CloseableHttpClient httpClient = HttpClients.createDefault();
                    CloseableHttpResponse httpResponse = httpClient.execute(request)) {
                if (httpResponse.getStatusLine().getStatusCode() == 200) {
                    result = new JSONObject(EntityUtils.toString(httpResponse.getEntity()));
                }
            } catch (Exception e) {
                logger.log(Level.SEVERE, e.getMessage(), e);
            }
        }

        return result;
    }
}
