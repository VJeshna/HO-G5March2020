package com.mastek.bankapp.model;

import com.mastek.bankapp.model.InsuffientBalanceException;

public interface IService extends IWithdraw,IDeposit{
	
	double withdraw(double amount) throws InsuffientBalanceException;
    double deposit(double amount);
}
