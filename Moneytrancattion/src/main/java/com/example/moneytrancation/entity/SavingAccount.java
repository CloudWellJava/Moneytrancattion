package com.example.moneytrancation.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="savingaccount")
public class SavingAccount {
	
	@Column(name="id")
	private long id;
	@Column(name="accountNumber")
	private int accountNumber;
	
	@Column(name="accountBalance")
	private BigDecimal  accountBalance;
	
	@OneToMany(mappedBy="savingAccount",cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<SavingTransaction> savingtransaction;

	public SavingAccount()
	{
		
	}
	
	
	
	public SavingAccount(long id, int accountNumber, BigDecimal accountBalance,
			List<SavingTransaction> savingtransaction) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.savingtransaction = savingtransaction;
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

	public List<SavingTransaction> getSavingtransaction() {
		return savingtransaction;
	}

	public void setSavingtransaction(List<SavingTransaction> savingtransaction) {
		this.savingtransaction = savingtransaction;
	}



	@Override
	public String toString() {
		return "SavingAccount [id=" + id + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", savingtransaction=" + savingtransaction + "]";
	}
	

	
}
