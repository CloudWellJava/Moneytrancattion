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
@Table(name="savingtransaction")
public class SavingTransaction {
	
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
	private SavingAccount savingAccount;
	

	public SavingTransaction() {
		
	}


	public SavingTransaction(long id, Date date, String desctiption, String type, String status, double amount,
			BigDecimal availableBalance, SavingAccount savingAccount) {
		super();
		this.id = id;
		this.date = date;
		this.desctiption = desctiption;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.availableBalance = availableBalance;
		this.savingAccount = savingAccount;
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


	public SavingAccount getSavingAccount() {
		return savingAccount;
	}


	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}


	@Override
	public String toString() {
		return "SavingTransaction [id=" + id + ", date=" + date + ", desctiption=" + desctiption + ", type=" + type
				+ ", status=" + status + ", amount=" + amount + ", availableBalance=" + availableBalance
				+ ", savingAccount=" + savingAccount + "]";
	}
	
	
	
}
