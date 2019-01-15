package edu.neu.cs4500.models;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;

	//id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	//username
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	//password
	public String getPassword() {
		return password;
	}
	public void setUserName(String password) {
		this.password = password;
	}
	
	//firstName
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//lastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
