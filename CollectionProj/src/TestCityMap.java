import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestCityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    //cityname,List of branchnames
		HashMap<String,List<String>> cityAndBranch = new HashMap<>();
		
		List<String> branchList = new ArrayList<>();
		
		branchList.add("Branch1");
		branchList.add("Branch2");
		branchList.add("Branch3");

		
		cityAndBranch.put("city1",branchList);
		cityAndBranch.put("city2",Arrays.asList(new String[] {"Branch1","Branch2","Branch3"}));
		cityAndBranch.put("city3",Arrays.asList(new String[] {"Branch1","Branch2","Branch3"}));
		
		//Arrays.asList(new String[] {"Branch1","Branch2","Branch3"});
		
		
	}

}
