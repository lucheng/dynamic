package com.cheng.dynamic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cheng.dynamic.entity.Test1;
import com.cheng.dynamic.repository.primary.Test1Dao;

@Service
@Transactional("transactionManagerPrimary")
public class Test1Service {
	@Autowired
	private Test1Dao test1Dao;
	
	public void test(){
		System.out.println(test1Dao);
	}
	
	public void add(Test1 t){
		test1Dao.add(t);
//		System.out.println(1/0);
	}
}
