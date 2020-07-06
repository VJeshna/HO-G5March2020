package com.mastek.model;

//@XmlRootElement
public class HelloWorld {
	
	private int id;
	private String message;
	
	public HelloWorld() {
		super();
	}

	public HelloWorld(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		HelloWorld other = (HelloWorld) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HelloWorld [id=" + id + ", message=" + message + "]";
	}
}