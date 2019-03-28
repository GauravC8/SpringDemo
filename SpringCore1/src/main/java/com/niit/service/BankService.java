package com.niit.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class BankService {

	public String deposit(String acNo) {
		if (acNo.equals("testing")) {
			System.out.println("Successfully Deposited to or Account at: " + new Date());
			return "Success";
		} else {
			return "Invalid";
		}
	}
}
