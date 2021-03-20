package com.example.moneytrancation.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="appoinment")
public class Appoinment {
	
	@Column(name="id")
	private int id;
	@Column(name="date")
	private Date date;
	@Column(name="location")
	private String loacation;
	@Column(name="description")
    private String description;
	@Column(name="conformation")
    private String conformation;
    
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="user_id")
    private User user;

	public Appoinment()
	{
		
	}

	public Appoinment(int id, Date date, String loacation, String description, String conformation, User user) {
		super();
		this.id = id;
		this.date = date;
		this.loacation = loacation;
		this.description = description;
		this.conformation = conformation;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLoacation() {
		return loacation;
	}

	public void setLoacation(String loacation) {
		this.loacation = loacation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getConformation() {
		return conformation;
	}

	public void setConformation(String conformation) {
		this.conformation = conformation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Appoinment [id=" + id + ", date=" + date + ", loacation=" + loacation + ", description=" + description
				+ ", conformation=" + conformation + ", user=" + user + "]";
	}
	
	
}
