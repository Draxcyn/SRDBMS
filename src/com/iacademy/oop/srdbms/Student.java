package com.iacademy.oop.srdbms;

class Student {
	private int id;
	private String lastName;
	private String firstName;
	private String course;
	int yearLevel;
	int unitsEnrolled;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	public int getUnitsEnrolled() {
		return unitsEnrolled;
	}
	public void setUnitsEnrolled(int unitsEnrolled) {
		this.unitsEnrolled = unitsEnrolled;
	}

	
	
}
