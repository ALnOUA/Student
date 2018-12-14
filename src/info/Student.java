package info;

public class Student {
	private int id;
	private String surName;
	private String name;
	private String fathersName;
	private int burthday;
	private int burthMonth;
	private int burthYear;
	private String address;
	private String phoneNumber;
	private String faculty;
	private int course;
	private int group;
	public int getId() {
		return id;
	}
	public String getSurName() {
		return surName;
	}
	public String getName() {
		return name;
	}
	public String getFathersName() {
		return fathersName;
	}
	public int getBurthday() {
		return burthday;
	}
	public int getBurthMonth() {
		return burthMonth;
	}
	public int getBurthYear() {
		return burthYear;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getFaculty() {
		return faculty;
	}
	public int getCourse() {
		return course;
	}
	public int getGroup() {
		return group;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public void setBurthday(int burthday) {
		this.burthday = burthday;
	}
	public void setBurthMonth(int burthMonth) {
		this.burthMonth = burthMonth;
	}
	public void setBurthYear(int burthYear) {
		this.burthYear = burthYear;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public Student(int id, String surName, String name, String fathersName, int burthday, int burthMonth, int burthYear,
			String address, String phoneNumber, String faculty, int course, int group) {
		super();
		this.id = id;
		this.surName = surName;
		this.name = name;
		this.fathersName = fathersName;
		this.burthday = burthday;
		this.burthMonth = burthMonth;
		this.burthYear = burthYear;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.faculty = faculty;
		this.course = course;
		this.group = group;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", surName=" + surName + ", name=" + name + ", fathersName=" + fathersName
				+ ", burthday=" + burthday + ", burthMonth=" + burthMonth + ", burthYear=" + burthYear + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", faculty=" + faculty + ", course=" + course + ", group="
				+ group + "]";
	}
	


	
	
	

}
