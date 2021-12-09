package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyService {
    private static Properties property = new Properties();

    private PropertyService() {
    }

    static {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBrowser(){
        return getProperty("browser");
    }
    private static String getProperty(String propertyKey) {
        if (System.getProperty(propertyKey) != null)
            return System.getProperty(propertyKey);
        else
            return property.getProperty(propertyKey);
    }
}


