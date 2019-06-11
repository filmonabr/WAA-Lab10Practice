package edu.mum.cs.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
//@NamedQuery(query = "select e from Employee e where e.number like :number", name = "Employee.locateOneEmployeeByHisNumber")

public class Employee {
	@Id
	@GeneratedValue(generator="employeeGen")
	private Integer id;

	private String firstName;

	private String lastName;

	private String number;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
	private Address address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
