package com.aop.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.aop.config.AppConfig;
import com.aop.dao.admin.AdminDao;
import com.aop.dao.member.MemberDao;

@SpringJUnitConfig(classes = AppConfig.class)
public class AspectsJStyleDemoTest {

	@Autowired
	private AdminDao admin;
	@Autowired
	private MemberDao member;

	@Test
	void test() {
		admin.searchSomething();
		member.searchData();
	}
}
