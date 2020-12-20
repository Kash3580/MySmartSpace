package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class Users {
	@Id
	private String user_id; // this is email
	
	@Column(length = 30)
	private String first_name;
	
	
	@Column(length = 30 )
	private String last_name;
	
	@Column(length = 30) // in fronted set max to 30
	private String email;
	
	@Column(length = 30) // in fronted set max to 30
	private String password;
	
	@Column(length = 50)
	private String service_provider_id;
	
	@Column(length = 100)
	private String title; // only for service provider // shop name with address 
	
	@Column(length = 12)
	private String contact_number;
	
	@Column(length = 100)
	private String address;
	
	/*  date of account creation for further extension */
	
	
	public Users() {
		System.out.println("in ctor of "+getClass().getName());
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getService_provider_id() {
		return service_provider_id;
	}

	public void setService_provider_id(String service_provider_id) {
		this.service_provider_id = service_provider_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", password=" + password + ", service_provider_id=" + service_provider_id + ", title=" + title
				+ ", contact_number=" + contact_number + ", address=" + address + "]";
	}
	
	
	

	

}
