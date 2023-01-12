package com.aop.dao.admin;

import org.springframework.stereotype.Repository;

import com.aop.utils.SearchLog;

@Repository
@SearchLog
public class AdminDao {

	public void searchSomething() {
		System.out.println("Admin Dao Search");
	}

	public void saveSomething() {
		System.out.println("Save Operation of Admin Dao");
	}
}
