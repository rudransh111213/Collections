package com.java;

public class Item implements Comparable<Item>, Cloneable{

	private int id;
	private String name;
	private float price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	static public int comparePrice(Item i1,Item i2) {
		if(i1.price > i2.price) {
			return 1;
		}else if(i1.price < i2.price) {
			return -1;
		}
		
		return 0;
	}
	
	@Override
	public int compareTo(Item i2) {
		
		if(this.id > i2.id) {
			return 1;
		}else if(this.id < i2.id) {
			return -1;
		}
		
		return 0;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {

		Item i2 = (Item)obj;
		
		if(this.id == i2.id && this.name.equals(i2.name) && this.price == i2.price) {
			return true;
		}
		
		return false;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id > 0) {
			this.id = id;
		}else {
			System.err.println("Invalid id");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
}
