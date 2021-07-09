package com.cognizant.loan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Loan {
	private String l_number;
	private String l_type;
	private int l_amount;
	private int l_emi;
	private int l_tenure;
	
}
