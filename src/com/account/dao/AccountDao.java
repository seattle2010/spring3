package com.account.dao;

public interface AccountDao{

	void outMoney(String out, double money);

	void inMoney(String in, double money);
}
