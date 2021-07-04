package Milestone2;

import java.io.Serializable;

public class PersonContact extends AllContact implements Serializable{
	private String birthday;
	private String photo;

	public PersonContact(int number, String name, String phone, String location) {
		super(number, name, phone, location);
	}

	public PersonContact(int number, String name, String phone, String location, String birthday, String photo) {
		super(number, name, phone, location);
		this.birthday = birthday;
		this.photo = photo;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setWebsite(String website) {
		// TODO Auto-generated method stub

	}

	public String getWebsite() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setHours(String hours) {
		// TODO Auto-generated method stub

	}

	public String getHours() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "PersonContact [birthday: " + birthday + ", photo: " + photo + ", toString(): " + super.toString() + "]";
	}

}
