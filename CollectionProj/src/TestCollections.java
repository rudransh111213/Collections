import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.Customer;

public class TestCollections {
	
	public static List<Customer> filterCustomerByName(List<Customer> customers){
		
		ArrayList<Customer> list = new ArrayList<>();
		
		for (Customer customer : customers) {
			if(customer.getName().startsWith("A")) {
				list.add(customer);
			}
		}
		
		return list;
		
	}
	
	public static List<Customer> filterCustomersById(List<Customer> customers){
		
		ArrayList<Customer> list = new ArrayList<>();
		
		for (Customer customer : customers) {
		
			if(customer.getId() > 103) {
				list.add(customer);
			}
			
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> customers = new ArrayList<>();	
		
		customers.add(new Customer(101,"Hary",LocalDate.of(1985,6,12),"Hyderabad"));
		customers.add(new Customer(102,"Raj",LocalDate.of(1995,4,20),"Vizag"));
		customers.add(new Customer(103,"Rachel",LocalDate.of(1990,5,1),"Pune"));
		customers.add(new Customer(104,"Archana",LocalDate.of(1993,1,13),"Pune"));
		customers.add(new Customer(105,"Anil",LocalDate.of(1995,1,21),"Hyderabad"));
		customers.add(new Customer(106,"Jhon",LocalDate.of(1992,4,2),"Vizag"));
		
		List<Customer> list = customers.stream().filter((c) -> { if(c.getId() > 103) return true; return false;}).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		
//		List<Customer> newList = filterCustomerByName(customers);
//		
//		for (Customer customer : newList) {
//			System.out.println(customer);
//		}
		
//		List<Customer> newCustomersList = filterCustomersById(customers);
//		
//		for (Customer customer : newCustomersList) {
//			System.out.println(customer);
//		}
		
	}

}
