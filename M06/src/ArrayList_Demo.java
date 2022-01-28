import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add("A");   //adding A to the ArrayList
		
		System.out.println(a);

		a.add(10);
		a.add("B");
		a.add("A");
		a.add(null);
		
		System.out.println(a);
		
		a.add(2, 15);  // adding 15 at the index 2
		System.out.println(a);
		
		a.remove(2);	//removing element frome list
		System.out.println(a);
		
	}

}
