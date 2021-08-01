package com.restapp.RestApp.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.restapp.RestApp.entities.Account;

@Service
public class AccountOperations implements AccountMethod
{

	@Autowired
	private AccountService accountService;

	
	@Override
	public List<Account> getAccounts() {
	
		return accountService.findAll();
	}

	@Override
	public Account getAccount(Long accno) {

		return accountService.getById(accno);
	}

	@Override
	public Account addAccount(Account account) {

		return accountService.save(account);
	}
	
	@Override
	public Account upadteAccount(Account account) {
	
		return accountService.save(account);
	}
	

	@Override
	public void deleteAccount(Long accno) {

		Account Entity = accountService.getById(accno);
		accountService.delete(Entity);
		
	}



}
