package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    private PropertyReader() {
    } //Prevent the class from being constructed

    public static String getProperty(String name) {
        try {
            Properties prop = new Properties();
            String pathToConfigs = "src/resources/config.properties";
            prop.load(new FileInputStream(pathToConfigs));
            return prop.getProperty(name);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
