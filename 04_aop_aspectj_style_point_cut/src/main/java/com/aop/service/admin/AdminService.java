package com.aop.service.admin;

import org.springframework.stereotype.Service;

@Service
public class AdminService {

	 public void doOperation() {
		 System.out.println("Admin Service Working !");
	 }
	 
	 public void doForAccount() {
		 System.out.println("Admin Service Using Account !");
	 }
}
