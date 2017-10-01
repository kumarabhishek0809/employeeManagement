package com.employee.management.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {
	
    public Employee() {
    }

	public Employee(String name, String email, String phoneNumber, String currentState) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.currentState = currentState;
	}

	@Id
    private String id;
//	@Indexed(unique = true)
    private String name;
    private String email;
    private String phoneNumber;
    private String currentState;


    public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getCurrentState() {
		return currentState;
	}


	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}


    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", currentState=" + currentState + "]";
	}
    
}
