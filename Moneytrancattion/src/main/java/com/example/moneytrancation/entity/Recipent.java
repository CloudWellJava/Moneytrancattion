package com.example.moneytrancation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="recipent")
public class Recipent {
	
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="accountNumber")
	private String accountNumber;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="user_id")
	private User user;
	
   
	public Recipent()
	{
		
	}


	public Recipent(long id, String name, String email, String phone, String accountNumber, String description,
			User user) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.accountNumber = accountNumber;
		this.description = description;
		this.user = user;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
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


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Recipent [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", accountNumber="
				+ accountNumber + ", description=" + description + ", user=" + user + "]";
	}
	
	
	
}