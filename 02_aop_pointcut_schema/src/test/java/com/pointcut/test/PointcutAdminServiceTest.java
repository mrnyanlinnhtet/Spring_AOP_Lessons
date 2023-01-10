package com.pointcut.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.pointcut.demo.member.service.MemberService;
import com.pointcut.demo.utils.Data;

@SpringJUnitConfig(locations = "classpath:/application-context.xml")
public class PointcutAdminServiceTest {

	
	@Autowired
	private MemberService memberService;
	
	@Test
	 void test() {
		memberService.saveData(new Data(10));
	 }
}
