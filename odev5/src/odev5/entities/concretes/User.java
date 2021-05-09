package odev5.entities.concretes;

import odev5.entities.abstracts.Entity;

public class User implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String ePosta;
	private String password;
	private boolean verify;
	
	public User() {
		super();
	}
	
	public User(int id, String firstName, String lastName, String ePosta, String password, boolean verify) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ePosta = ePosta;
		this.password = password;
		this.verify = verify;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isVerify() {
		return verify;
	}

	public void setVerify(boolean verify) {
		this.verify = verify;
	}
	
	public String getFullName() {
		return this.firstName + "" +this.lastName;
		
	}
	
	

}
