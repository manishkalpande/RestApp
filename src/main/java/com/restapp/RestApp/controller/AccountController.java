package com.restapp.RestApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapp.RestApp.entities.Account;
import com.restapp.RestApp.models.AccountMethod;
import com.restapp.RestApp.models.AccountOperations;
import com.restapp.RestApp.models.AccountService;


@Configuration
@ComponentScan
@EnableAutoConfiguration
@RestController
public class AccountController {
	
//	@GetMapping("/home")
//	public String home() {
//		return "Project is reday manish lets start";
//	}
	
	@Autowired
	private AccountMethod accountMethod;
	
	//get all Account 
	
	@GetMapping("/all")
	public List<Account> getAccounts()
	{
		return this.accountMethod.getAccounts();
	}
	
	@GetMapping("/accountno/{accno}")
	public Account getAccount(@PathVariable String accno)
	{
		return this.accountMethod.getAccount(Long.parseLong(accno));
	}
	
	//Account add
	@PostMapping("/account")
	public Account addAccount(@RequestBody Account account)
	{
		return this.accountMethod.addAccount(account);
	}
	
	//Update Account using put request
	@PutMapping("/account")
	public Account update(@RequestBody Account account)
	{
		return this.accountMethod.upadteAccount(account);
	}
	
	@DeleteMapping("/account/{accno}")
	public ResponseEntity<HttpStatus> deleteAccount(@PathVariable String accno)
	{
		try {
			this.accountMethod.deleteAccount(Long.parseLong(accno));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
