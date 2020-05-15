package com.mastek.app;

import java.util.List;

public interface IService<T> {

	List<T> findAll();

	T findById(long id);

	boolean save(T object);
}