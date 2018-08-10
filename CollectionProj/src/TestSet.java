import java.util.ArrayList;
import java.util.HashSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> names = new HashSet<>();
		
		names.add("Hary");
		names.add("Raj");
		names.add("Kumar");
		names.add("Jhon");
		names.add("Ria");
		names.add("Raj");
		names.add("Rachel");
		names.add("Archana");
		
		for (String str : names) {
			System.out.println(str);
		}
	
		
	}

}
