package com.java;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestDishes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Dish> dishes = Dish.menu.stream().filter(d -> d.getCalories() > 500).collect(Collectors.toList());
		
		//dishes.forEach(System.out::println);
		
//		List<String> names = Dish.menu.stream().filter(d -> d.isVegetarian()).map(Dish::getName).collect(Collectors.toList());
//		
//		names.forEach(System.out::println);

//		if(Dish.menu.stream().anyMatch(d -> d.getName().equals("shrimp"))) {
//			System.out.println("Yes there is a shrimp dish");
//		}
		
		
		Comparator<Dish> comparator = (Dish d1,Dish d2) -> {
			if(d1.getCalories() > d2.getCalories()) {
				return 1;
			}else if(d1.getCalories() < d2.getCalories()) {
				return -1;
			}
			
			return 0;
		};
 		
		List<Dish> names = Dish.menu.stream().sorted(comparator).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		
	}

}

