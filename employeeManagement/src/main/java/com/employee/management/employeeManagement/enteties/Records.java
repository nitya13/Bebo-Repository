package com.employee.management.employeeManagement.enteties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "add_emp_records")
public class Records {
	
	
	private String firstName;
	private String lastName;
	
	@Id
	@Column(name = "EMAIL")
	private String email;
	private String address;
	private String contactNo;
	private String position;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Course [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address=" + address
				+ ", contactNo=" + contactNo + ", position=" + position + "]";
	}
	public Records(String firstName, String lastName, String email, String address, String contactNo, String position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.contactNo = contactNo;
		this.position = position;
	}
	public Records() {
		super();
		// TODO Auto-generated constructor stub
	}

}
