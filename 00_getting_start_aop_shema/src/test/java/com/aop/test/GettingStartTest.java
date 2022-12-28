package com.aop.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.aop.business.BusinessDemo;
import com.aop.business.MyBusiness;

@SpringJUnitConfig(locations = "classpath:context.xml")
public class GettingStartTest {

	 @Autowired
	 private BusinessDemo business;
	 @Autowired
	 private MyBusiness myBusiness;
	 
	 @Test
	 void getting_start_test() {
		 assertNotNull(business);
		 assertNotNull(myBusiness);
		 business.doBusiness();
		 myBusiness.myBusiness();
	 }
}
