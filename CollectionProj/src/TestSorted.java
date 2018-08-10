import java.util.TreeSet;

import com.java.Order;

public class TestSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Order> orders = new TreeSet<>(Order::compareOrderId);
		
		orders.add(new Order(113,2,30));
		orders.add(new Order(111,4,20));				
		orders.add(new Order(114,1,5));
		orders.add(new Order(112,3,10));
		
		for (Order order : orders) {
			System.out.println(order);
		}

	}

}
