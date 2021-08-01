package com.restapp.RestApp.models;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restapp.RestApp.entities.Account;

public interface AccountMethod {
	
	public List<Account> getAccounts();
	
	public Account getAccount(Long accno);
	
	public Account addAccount(Account account);
	
	public Account upadteAccount(Account account);
	
	public void deleteAccount(Long accno);
	
	

}
