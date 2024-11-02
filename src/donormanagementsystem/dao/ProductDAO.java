package donormanagementsystem.dao;

import java.io.*;
import java.util.Properties;
/**
 *
 * @author danieltan
 */
public class ProductDAO {
    private String fileName;
    
    public ProductDAO() {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
            fileName = properties.getProperty("productFileName");
            if (fileName == null || fileName.isEmpty()) {
                throw new IOException("Filename not set in config.properties");
            }
        } catch (IOException e) {
            e.printStackTrace();
            fileName = "products.dat"; // default if config fails
        }
    }
}
