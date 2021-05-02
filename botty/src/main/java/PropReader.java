import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropReader {
    private static Logger logger = Logger.getLogger(PropReader.class.getName());

    public Properties getPropValues(String fileName){
        Properties properties = new Properties();

        try(InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName)){
            if (inputStream != null){
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException(String.format("API config properties file not found: %s", fileName));
            }
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e);
        }

        return properties;
    }
}
