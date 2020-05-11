package com.mastek.bankapp.model;

public class InsuffientBalanceException extends Exception {
	
	
	private static final long serialVersionUID = 1L;

	public InsuffientBalanceException(String message) {
        super(message);
	}

}
