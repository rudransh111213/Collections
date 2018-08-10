import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.java.Item;
import com.java.ItemNameComparator;
import com.java.ItemPriceComparator;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Item> items = new ArrayList<>();
		
		items.add(new Item(102,"iPhone",400));
		items.add(new Item(101,"Vivo",200));
		items.add(new Item(104,"Sony",230));
		items.add(new Item(103,"Blackberry",300));
		
		//Collections.sort(items,new ItemPriceComparator());
		
		//Collections.sort(items,new ItemNameComparator());
		
//		Comparator<Item> comparator = new Comparator<Item>() {
//			
//			@Override
//			public int compare(Item i1, Item i2) {
//				return i1.getName().compareTo(i2.getName());
//			}
//		};
		
		//Comparator<Item> comparator = (Item i1,Item i2) -> { return i1.getName().compareTo(i2.getName()); };
		
		
		
		//Collections.sort(items,(Item i1,Item i2) -> { return i1.getName().compareTo(i2.getName()); });
		
		Collections.sort(items,Item::comparePrice);

		for (Item item : items) {
			System.out.println(item);
		}
	}

}
