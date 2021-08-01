package com.restapp.RestApp.models;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restapp.RestApp.entities.Account;

public interface AccountService extends JpaRepository<Account, Long>{
	
	

}
