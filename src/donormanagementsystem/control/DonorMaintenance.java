package donormanagementsystem.control;

import donormanagementsystem.adt.*;
import donormanagementsystem.entity.*;
import donormanagementsystem.dao.*;

/**
 *
 * @author Daniel Yee Kheng Tan
 */
public class DonorMaintenance {

	private ListInterface<Donor> donorList = new ArrayList<>();
	private DonorDAO donorDAO = new DonorDAO();

	public DonorMaintenance() {
		donorList = donorDAO.retrieveFromFile();
	}

	public void run() {

	}
}
