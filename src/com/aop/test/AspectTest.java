package com.aop.test;

import com.aop.dao.CustomerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextAOP.xml")
public class AspectTest {

	@Resource(name = "customerDao")
	private CustomerDao customerDao;
@Test
	public void Aspect1() {
		customerDao.save();
	}
}
