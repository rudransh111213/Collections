import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.Customer;

public class TestStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Customer> customers = new ArrayList<>();		
		
		customers.add(new Customer(101,"Hary",LocalDate.of(1985,6,12),"Hyderabad"));
		customers.add(new Customer(102,"Raj",LocalDate.of(1995,4,20),"Vizag"));
		customers.add(new Customer(103,"Rachel",LocalDate.of(1990,5,1),"Pune"));
		customers.add(new Customer(104,"Archana",LocalDate.of(1993,1,13),"Pune"));
		customers.add(new Customer(105,"Anil",LocalDate.of(1995,1,21),"Hyderabad"));
		customers.add(new Customer(106,"Jhon",LocalDate.of(1992,4,2),"Vizag"));
		customers.add(new Customer(107,"Steve",LocalDate.of(1986,3,21),"Mumbai"));
		customers.add(new Customer(108,"Ana",LocalDate.of(1991,4,12),"NewYork"));
		
		//Stream<Customer> stream = customers.stream();
		
		//Stream<Customer> stream = customers.stream().filter((Customer c) -> { if(c.getId() > 103) return true; return false;});
		
		//Stream<Customer> stream = customers.stream().filter(c -> c.getId() > 103);
		
//		Stream<Customer> stream = customers.stream().filter(c -> c.getId() > 102 && c.getCity().equals("Vizag"));
//		
//		List<Customer> customersList = stream.collect(Collectors.toList());
//		
//		customersList.forEach(System.out::println);

//		List<Customer> customers2 = customers.stream().filter(c -> c.getId() > 102 && c.getCity().equals("Vizag")).collect(Collectors.toList());
		
		
		List<String> names = customers.stream().filter(c -> c.getId() > 102 && c.getCity().equals("Vizag")).map(c -> c.getName()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		//stream.forEach(System.out::println);
		
		

	}

}
