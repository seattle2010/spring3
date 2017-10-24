package com.account.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	@Override
	public void outMoney(String out, double money) {
		this.getJdbcTemplate().update("UPDATE t_account SET money = money-? WHERE name = ?", money, out);
	}

	@Override
	public void inMoney(String in, double money) {
		this.getJdbcTemplate().update("UPDATE t_account SET money = money+? WHERE name = ?", money, in);

	}
}
