package com.account.service;

import com.account.dao.AccountDao;
import lombok.Setter;

public class AccountServiceImpl implements AccountService {
	@Setter
	private AccountDao accountDao;
	@Override
	public void pay(String out, String in, double money) {
		accountDao.outMoney(out, money);

		//

		accountDao.inMoney(in, money);

	}
}
