package com.example.moneytrancation.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Column(name="user_id")
	private long user_id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="first_name")
	private  String first_name;

	@Column(name="last_name")
	private String last_name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="id")
	private PrimaryAccount primaryaccount;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="id")
	private SavingAccount savingaccount;
	
	@OneToMany(mappedBy="user",cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Appoinment> appoinment;
	
	@OneToMany(mappedBy="user",cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Recipent> recipent;
	
	public User()
	{
		
	}

	public User(long user_id, String user_name, String first_name, String last_name, String email, String phone,
			boolean enabled, PrimaryAccount primaryaccount, SavingAccount savingaccount, List<Appoinment> appoinment,
			List<Recipent> recipent) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
		this.primaryaccount = primaryaccount;
		this.savingaccount = savingaccount;
		this.appoinment = appoinment;
		this.recipent = recipent;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public PrimaryAccount getPrimaryaccount() {
		return primaryaccount;
	}

	public void setPrimaryaccount(PrimaryAccount primaryaccount) {
		this.primaryaccount = primaryaccount;
	}

	public SavingAccount getSavingaccount() {
		return savingaccount;
	}

	public void setSavingaccount(SavingAccount savingaccount) {
		this.savingaccount = savingaccount;
	}

	public List<Appoinment> getAppoinment() {
		return appoinment;
	}

	public void setAppoinment(List<Appoinment> appoinment) {
		this.appoinment = appoinment;
	}

	public List<Recipent> getRecipent() {
		return recipent;
	}

	public void setRecipent(List<Recipent> recipent) {
		this.recipent = recipent;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", first_name=" + first_name + ", last_name="
				+ last_name + ", email=" + email + ", phone=" + phone + ", enabled=" + enabled + ", primaryaccount="
				+ primaryaccount + ", savingaccount=" + savingaccount + ", appoinment=" + appoinment + ", recipent="
				+ recipent + "]";
	}
	
	
	

}
