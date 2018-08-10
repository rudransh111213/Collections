import java.util.HashSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<String> names = new TreeSet<>();
		
		names.add("Hary");
		names.add("Raj");
		names.add("Kumar");
		names.add("Jhon");
		names.add("Ria");		
		names.add("Rachel");
		names.add("Archana");
		
		for (String str : names) {
			System.out.println(str);
		}
	
		
	}

}
