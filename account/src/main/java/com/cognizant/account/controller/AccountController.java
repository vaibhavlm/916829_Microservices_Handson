package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;

@RestController
public class AccountController {
	
	@GetMapping(value="/accounts/{number}")
	public Account getAccountDetails(@PathVariable int number) {
		return new Account("919879879891","current",567890);
	}
}
