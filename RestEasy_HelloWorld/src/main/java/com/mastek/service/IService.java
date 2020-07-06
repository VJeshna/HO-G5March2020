package com.mastek.service;

import java.util.List;

public interface IService<T> {
	
	 T findById(int id); 
	 List<T> findAll();
	 boolean save(T object);
}
