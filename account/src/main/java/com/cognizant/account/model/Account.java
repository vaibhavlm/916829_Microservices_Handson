package com.cognizant.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Account {
	
	private String acc_number;
	private String acc_type;
	private int acc_balance;
	
}
