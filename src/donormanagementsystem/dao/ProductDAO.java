//package donormanagementsystem.dao;
//
//import donormanagementsystem.adt.*;
//import java.io.*;
//import java.util.Properties;
///**
// *
// * @author danieltan
// */
//public class ProductDAO {
//    private String fileName;
//
//    public ProductDAO() {
//        Properties properties = new Properties();
//        try (FileInputStream input = new FileInputStream("config.properties")) {
//            properties.load(input);
//            fileName = properties.getProperty("productFileName");
//            if (fileName == null || fileName.isEmpty()) {
//                throw new IOException("Filename not set in config.properties");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            fileName = "donor.dat"; // default if config fails
//        }
//    }
//
//    public void saveToFile(ListInterface<Product> productList) {
//        File file = new File(fileName);
//        try (ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream(file))) {
//            ooStream.writeObject(productList);
//            System.out.println("Data saved to " + fileName);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
