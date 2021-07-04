package Milestone2;

import java.io.Serializable;

public class BusinessContact extends AllContact implements Serializable{
	private String hours;
	private String website;

	public BusinessContact(int number, String name, String phone, String location) {
		super(number, name, phone, location);
	}

	public BusinessContact(int number, String name, String phone, String location, String hours, String website) {
		super(number, name, phone, location);
		this.hours = hours;
		this.website = website;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "BusinessContact [hours=" + hours + ", website=" + website + ", toString()=" + super.toString() + "]";
	}
}
