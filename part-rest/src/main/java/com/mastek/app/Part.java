package com.mastek.app;


import java.io.Serializable;


public class Part implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int part_id;
    private String part_name;
    public Part() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Part(int part_id, String part_name) {
        super();
        this.part_id = part_id;
        this.part_name = part_name;
    }
    public int getPart_id() {
        return part_id;
    }
    public void setPart_id(int part_id) {
        this.part_id = part_id;
    }
    public String getPart_name() {
        return part_name;
    }
    public void setPart_name(String part_name) {
        this.part_name = part_name;
    }
    @Override
    public String toString() {
        return "Part [part_id=" + part_id + ", part_name=" + part_name + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + part_id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Part other = (Part) obj;
        if (part_id != other.part_id)
            return false;
        return true;
    }
    
}