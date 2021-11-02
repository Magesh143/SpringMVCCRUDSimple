package com.sunny.beans;

public class Emp {
	private int id;
	private String name1;
	private float salary;
	private String email;
	private boolean isActive;
	private boolean isReference;
	private String designation;
	private String phoneNumber;
	private String dept;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name1;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name1 = name;
	}

	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the isReference
	 */
	public boolean isReference() {
		return isReference;
	}

	/**
	 * @param isReference the isReference to set
	 */
	public void setReference(boolean isReference) {
		this.isReference = isReference;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee Object: [id = " + id + ", name = " + name1 + ", salary = " + salary + ", designation = "
				+ designation + ", phone = " + phoneNumber + ", dept = " + dept + "]";
	}
}