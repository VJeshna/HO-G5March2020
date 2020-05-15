package com.mastek.app;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class PartService implements IService<Part>{


    private static final List<Part> list=new ArrayList<Part>();
    static{
        list.add(new Part(1001,"Part-1"));
        list.add(new Part(1002,"Part-2"));
        list.add(new Part(1003,"Part-3"));
    }
    @Override
    public List<Part> findAll() {
        
        return list;
    }


    @Override
    public Part findById(long id ) {
        Optional<Part> optional=list.stream().filter(p->p.getPart_id()==id).findAny();
        return optional.get();
    }


    @Override
    public boolean save(Part object) {
        if(!list.contains(object)) {
            list.add(object);
            return true;
        }
        return false;
    }
    
    public boolean delete(long id) {
    	final Part p = findById(id);
        if(list.contains(p)) {  	
        	list.remove(p);
            return true;
        }
        return false;
    }
    
    public boolean update(long id, String part_name) {
    	final Part p = findById(id);
        if(list.contains(p)) {  	
        	list.remove(p);
        	p.setPart_name(part_name);
        	list.add(p);
            return true;
        }
        return false;
    }

}