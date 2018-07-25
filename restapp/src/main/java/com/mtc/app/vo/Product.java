package com.mtc.app.vo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="productrecord")
@XmlType(propOrder = {"id","name","price","quantity","description"})
public class Product {
	
	
	private int id;
//	@XmlElement(name="name")
	private String name;
//	@XmlElement(name="price")
	private float price;
//	@XmlElement(name="quantity")
	private int quantity;
//	@XmlElement(name="description")
	private String description;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}	

	public Product(int id, String name, float price, int quantity, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}

	


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", description="
				+ description + "]";
	}

	@XmlElement(name="product_id")
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
