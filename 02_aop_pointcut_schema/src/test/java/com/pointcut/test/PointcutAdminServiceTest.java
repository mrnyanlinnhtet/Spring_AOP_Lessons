package com.pointcut.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.pointcut.demo.admin.service.AdminService;
import com.pointcut.demo.member.service.MemberService;

@SpringJUnitConfig(locations = "classpath:/application-context.xml")
public class PointcutAdminServiceTest {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private MemberService memberService;
	
	@Test
	 void test() {
		 adminService.hello("Hello Spring AOP");
		 adminService.doSomething();
		 memberService.memberCall();
	 }
}
