package donormanagementsystem.dao;

import donormanagementsystem.adt.*;
import donormanagementsystem.entity.*;
import java.io.*;
import java.util.Properties;

/**
 *
 *  @author Daniel Yee Kheng Tan
 */
public class DonorDAO {
	private String fileName;

	public DonorDAO() {
		Properties properties = new Properties();
		try (FileInputStream input = new FileInputStream("config.properties")) {
			properties.load(input);
			fileName = properties.getProperty("donorFileName");
			if (fileName == null || fileName.isEmpty()) {
				throw new IOException("Filename not set in config.properties");
			}
		} catch (IOException e) {
			e.printStackTrace();
			fileName = "donor.dat"; // default if config fails
		}
	}

	public void saveToFile(ListInterface<Donor> donorList) {
		File file = new File(fileName);
		try (ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream(file))) {
			ooStream.writeObject(donorList);
//			System.out.println("Data saved to " + fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ListInterface<Donor> retrieveFromFile() {
		ListInterface<Donor> productList = new ArrayList<>();
		File file = new File(fileName);
		if (!file.exists()) {
//			System.out.println("File not found: " + fileName);
			return productList;
		}

		try (ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream(file))) {
			productList = (ListInterface<Donor>) oiStream.readObject();
//			System.out.println("Data retrieved from " + fileName);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return productList;
	}
}
