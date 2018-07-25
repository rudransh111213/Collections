import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Hary");//0
		names.add("Raj");//1
		names.add("Kumar");//2
		names.add("Jhon");//3

		names.add("Ria");//4
		//->
		names.add("Raj");//5
		names.add("Rachel");//6
		names.add("Archana");//7
		
		//names.set(2,"Anil");
		names.add(2,"Anil");

		System.out.println(names);
		
		//System.out.println(names.get(2));

		
		


		
//		LinkedList<String> names2 = new LinkedList<>();
//
//		names2.add("Ria");
//		names2.add("Rachel");
//		names2.add("Archana");
//		names2.add("Raj");
//		names2.add("Kumar");
		
//		Iterator<String> iterator = names.iterator();
//		
//		while (iterator.hasNext()) {
//			String str =  iterator.next();
//			System.out.println(str);
//		}

	//	names.addAll(names2);
		
//		names.removeAll(names2);
		
	//	names.retainAll(names2);
		
//		System.out.println(names.containsAll(names2));
//		
//		for (String str : names) {
//			System.out.println(str);
//		}
		
//		String[] namesArr = new String[names.size()];
//		
//		names.toArray(namesArr);
//		
//		for (String str : namesArr) {
//			System.out.println(str);
//		}
//		
		
		
//		Object[] objectsArr = names.toArray();
//		
//		for (Object obj : objectsArr) {
//			System.out.println(obj);
//		}
		
		//System.out.println(names.size());
		
		//System.out.println(names.contains("Raj"));
		
		
	}

}
