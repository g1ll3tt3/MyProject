package project.model.bean;

public class Person {
	private int personId;
	private String fullname;
	private String avatar;
	private String status;
	private String address;
	private String birthday;
	private String phone;
	private String homephone;
	private String about;
	private String job;
	private String description;
	
	public Person() {
		
	}

	public Person(int personId, String fullname, String avatar, String status, String address, String birthday,
			String phone, String homephone, String about, String job, String description) {
		super();
		this.personId = personId;
		this.fullname = fullname;
		this.avatar = avatar;
		this.status = status;
		this.address = address;
		this.birthday = birthday;
		this.phone = phone;
		this.homephone = homephone;
		this.about = about;
		this.job = job;
		this.description = description;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
