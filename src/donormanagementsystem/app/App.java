package donormanagementsystem.app;

import donormanagementsystem.adt.*;
import donormanagementsystem.entity.*;
import donormanagementsystem.dao.*;
import donormanagementsystem.control.*;

/**
 *
 * @author danieltan
 */
public class App {
	public static void main(String[] args) {
		DonorMaintenance donorMaintenance = new DonorMaintenance();
		donorMaintenance.run();

	}
}
