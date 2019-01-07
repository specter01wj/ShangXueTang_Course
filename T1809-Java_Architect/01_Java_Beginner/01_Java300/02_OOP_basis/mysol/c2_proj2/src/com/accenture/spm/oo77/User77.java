package com.accenture.spm.oo77;

public class User77 {

	int id;
	String name, pwd;
	
	public User77(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
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
		User77 other = (User77) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
