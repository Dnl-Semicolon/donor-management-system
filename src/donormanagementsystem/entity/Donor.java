package donormanagementsystem.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Kat Tan
 */
public class Donor implements Serializable {
	private String number;
	private String name;
	private int quantity;

	public Donor() {
	}

	public Donor(String number, String name, int quantity) {
		this.number = number;
		this.name = name;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Donor{" +
				"number='" + number + '\'' +
				", name='" + name + '\'' +
				", quantity=" + quantity +
				'}';
	}
}
