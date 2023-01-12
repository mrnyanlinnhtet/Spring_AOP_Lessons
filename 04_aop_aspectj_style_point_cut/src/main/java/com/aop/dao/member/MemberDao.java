package com.aop.dao.member;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

	public void searchData() {
		System.out.println("Member Dao is Working");
	}

}
