package com.mastek.bankapp.model;

public class SavingAccount extends BankAccount {

	private static final long serialVersionUID = 1L;
	private static final double MIN_BAL = 1000;

	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double withdraw(double amount) throws InsuffientBalanceException {
		final double diff = this.getBalance() - amount;
		if (diff >= MIN_BAL) {
			this.setBalance(diff);
		} else {
			throw new InsuffientBalanceException("Insuffient Balance");
		}
		return this.getBalance();
	}

	@Override
	public double deposit(double amount) {
		
		return 0;
	}

}
