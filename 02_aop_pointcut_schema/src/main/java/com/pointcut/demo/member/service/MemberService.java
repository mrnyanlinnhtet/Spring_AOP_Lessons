package com.pointcut.demo.member.service;

import org.springframework.stereotype.Service;

import com.pointcut.demo.utils.BeforeLogger;
import com.pointcut.demo.utils.Data;

@Service
@BeforeLogger
public class MemberService {

	public void memberCall() {
		System.out.println("Member is calling !");
	}

	public void memberCall(Data data) {
		System.out.println("Arg Type Annotation is Calling in" + data);
	}

	public void saveData(Data data) {
		System.out.println("Arg Type Annotation and Combination Pointcut is " + data);
	}
}
