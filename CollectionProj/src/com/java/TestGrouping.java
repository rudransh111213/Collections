package com.java;

import java.net.Proxy.Type;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

//import java.util.stream.Collectors.*;

public class TestGrouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Dish.Type,List<Dish>> dishesByType = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType));
		
		Set<Entry<Dish.Type,List<Dish>>> entries =  dishesByType.entrySet();
		
		for (Entry<Dish.Type, List<Dish>> entry : entries) {
			System.out.println(entry.getKey() +": ");
			
			for (Dish dish : entry.getValue()) {
				System.out.println(dish);
			}
			
			
			System.out.println();
			
		}
		
	}

}
