package com.pointcut.demo.member.service;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

	 public void memberCall() {
		 System.out.println("Member is calling !");
	 }
}
