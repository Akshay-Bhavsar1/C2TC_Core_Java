
public class BoolWrapper {

	public static void main(String[] args) {
		
		Boolean b=new Boolean("TRUE");
		Boolean c=new Boolean("True");
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(b.equals(c));

	}

}
