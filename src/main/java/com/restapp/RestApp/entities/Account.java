package com.restapp.RestApp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	Long accno;
	String accnm;
	String acctye;
	double balance;
	
	
	public Account(Long accno, String accnm, String acctye, double balance) {
		super();
		this.accno = accno;
		this.accnm = accnm;
		this.acctye = acctye;
		this.balance = balance;
	}


	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getAccno() {
		return accno;
	}


	public void setAccno(Long accno) {
		this.accno = accno;
	}


	public String getAccnm() {
		return accnm;
	}


	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}


	public String getAcctye() {
		return acctye;
	}


	public void setAcctye(String acctye) {
		this.acctye = acctye;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [accno=" + accno + ", accnm=" + accnm + ", acctye=" + acctye + ", balance=" + balance + "]";
	}
	
	
	
	
	

}
