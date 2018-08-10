package com.java;

import java.time.LocalDate;

public class Customer {
	
	private int id;
	private String name;
	private LocalDate dob;
	private String city;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		Customer c2 = (Customer)obj;
//		
//		if(this.id == c2.id && this.name.equals(c2.name) && this.dob.equals(c2.dob) && this.city.equals(c2.city)) {
//			return true;
//		}
//		
//		return false;
//	}

	
	
	public Customer(int id, String name, LocalDate dob, String city) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.city = city;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Customer other = (Customer) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dob=" + dob + ", city=" + city + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
