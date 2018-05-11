package com.cheng.dynamic.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cheng.dynamic.entity.Test1;
import com.cheng.dynamic.entity.Test2;
import com.cheng.dynamic.repository.primary.Test1Dao;
import com.cheng.dynamic.repository.secondary.Test2Dao;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class Test1DaoTest {
	@Autowired
	private Test1Dao test1Dao;
	@Autowired
	private Test2Dao test2Dao;
	
	@Test
	public void testGetById() {
		Test1 t = test1Dao.getById(1L);
		System.out.println(t );
		Test2 t2 = test2Dao.getById(1L);
		System.out.println(t2 );
	}

}
