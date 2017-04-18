package project.model.bean;

public class Person {
	private int personId;
	private String fullname;
	private String avatar;
	private String status;
	private String address;
	private String birthday;
	
	public Person() {
		
	}
	
	public Person(String fullname, String avatar, String status, String address, String birthday) {
		super();
		this.fullname = fullname;
		this.avatar = avatar;
		this.status = status;
		this.address = address;
		this.birthday = birthday;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
}
