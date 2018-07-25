import com.java.Item;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Item itemOriginal = new Item(101,"OnePlus",300);

		Item itemClone =  (Item)itemOriginal.clone();
		
		System.out.println(itemOriginal.equals(itemClone));
		

	}

}
