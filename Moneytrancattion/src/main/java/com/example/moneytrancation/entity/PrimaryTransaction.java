package com.example.moneytrancation.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="prymarytransaction")
public class PrimaryTransaction {
	
	@Column(name="id")
	private long id;
	@Column(name="date")
	private Date date;
	@Column(name="description")
    private String desctiption;
	@Column(name="type")
	private String type;
	@Column(name="status")
	private String status;
	@Column(name="amount")
	private double amount;
	@Column(name="availableBalance")
	private BigDecimal availableBalance;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="id")
	private PrimaryAccount primaryAccount;
	
 
	public PrimaryTransaction()
	{
		
	}


	public PrimaryTransaction(long id, Date date, String desctiption, String type, String status, double amount,
			BigDecimal availableBalance, PrimaryAccount primaryAccount) {
		super();
		this.id = id;
		this.date = date;
		this.desctiption = desctiption;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.availableBalance = availableBalance;
		this.primaryAccount = primaryAccount;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getDesctiption() {
		return desctiption;
	}


	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}


	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}


	public PrimaryAccount getPrimaryAccount() {
		return primaryAccount;
	}


	public void setPrimaryAccount(PrimaryAccount primaryAccount) {
		this.primaryAccount = primaryAccount;
	}


	@Override
	public String toString() {
		return "PrimaryTransaction [id=" + id + ", date=" + date + ", desctiption=" + desctiption + ", type=" + type
				+ ", status=" + status + ", amount=" + amount + ", availableBalance=" + availableBalance
				+ ", primaryAccount=" + primaryAccount + "]";
	}
	
	
	
}
