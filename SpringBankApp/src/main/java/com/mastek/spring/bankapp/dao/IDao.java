package com.mastek.spring.bankapp.dao;

import java.util.*;

import com.mastek.spring.bankapp.model.BankAccount;

public interface IDao<T> {

	List<T> findAll();
    T findById(long id);
    boolean save(T object);
	boolean delete(BankAccount account);
}

