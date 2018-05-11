package com.cheng.dynamic.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cheng.dynamic.entity.Test1;
import com.cheng.dynamic.entity.Test2;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class Test1ServiceTest {
	@Autowired
	private Test1Service test1Service;
	@Autowired
	private Test2Service test2Service;
	@Test
	@Transactional("transactionManagerPrimary")
	public void testTest() throws Exception {
		Test1 t1 = new Test1();
		t1.setName("t1");
		test1Service.add(t1);
		Test2 t2 = new Test2();
		t2.setName("t2");
		test2Service.add(t2);
	}

}
