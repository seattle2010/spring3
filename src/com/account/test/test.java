package com.account.test;

import com.account.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {
	
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void run1(){
		// 调用支付的方法
		accountService.pay("tom", "rose", 1000);
	}

}
