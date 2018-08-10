package com.java;

public class Order {
	
	private int orderId;
	private int productId;
	private int quantity;

	public Order() {
		// TODO Auto-generated constructor stub
	}	

	public Order(int orderId, int productId, int quantity) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
	}
	
	

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId + ", quantity=" + quantity + "]";
	}

	public static int compareOrderId(Order o1,Order o2) {
 
			if(o1.getOrderId() > o2.getOrderId()) {
				return 1;
			}else if(o1.getOrderId() < o2.getOrderId()){
				return -1;
			} 
			
			return 0;
			
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
