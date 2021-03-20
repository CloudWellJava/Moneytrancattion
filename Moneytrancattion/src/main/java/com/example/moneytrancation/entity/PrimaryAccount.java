package com.example.moneytrancation.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="primaryaccount")
public class PrimaryAccount {
	
	@Column(name="id")
	private long id;
	@Column(name="accountNumber")
	private int accountNumber;
	
	@Column(name="accountBalance")
	private BigDecimal  accountBalance;
	
	@OneToMany(mappedBy="primaryAccount",cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<PrimaryTransaction> primarytransaction;
	
	public PrimaryAccount()
	{
		
	}

	public PrimaryAccount(long id, int accountNumber, BigDecimal accountBalance,
			List<PrimaryTransaction> primarytransaction) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.primarytransaction = primarytransaction;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<PrimaryTransaction> getPrimarytransaction() {
		return primarytransaction;
	}

	public void setPrimarytransaction(List<PrimaryTransaction> primarytransaction) {
		this.primarytransaction = primarytransaction;
	}

	@Override
	public String toString() {
		return "PrimaryAccount [id=" + id + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", primarytransaction=" + primarytransaction + "]";
	}
	
	

}
