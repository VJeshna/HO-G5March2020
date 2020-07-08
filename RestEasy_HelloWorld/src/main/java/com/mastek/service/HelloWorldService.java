package com.mastek.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mastek.model.HelloWorld;

public class HelloWorldService implements IService<HelloWorld>{
	
	final static Logger logger = LoggerFactory.getLogger(HelloWorldService.class);
	
	private List<HelloWorld> list = new ArrayList<HelloWorld>(){
		private static final long serialVersionUID = 1L;
		{
			add(new HelloWorld(1,"Hello World"));
			add(new HelloWorld(2,"Hello Vanita"));
			add(new HelloWorld(3,"Welcome Vanita"));
		}
	};

	@Override
	public HelloWorld findById(int id) {
		logger.info("finding the message by Id");
		//logger.error("error happened");
		//logger.debug("The message of the ID: {} is {}", id, list.get(0).getMessage());
		
		for(HelloWorld hw : list)
		{
			if(hw.getId()==id)
				return hw;
		}
		
		return null;
	}

	@Override
	public List<HelloWorld> findAll() {
		logger.debug("printing all the messages {}", list);
		return list;
	}

	@Override
	public boolean save(HelloWorld object) {
		return false;
	}

}
