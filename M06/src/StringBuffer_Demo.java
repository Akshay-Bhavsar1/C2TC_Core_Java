
public class StringBuffer_Demo {

	public static void main(String[] args) {
		
		StringBuffer s1= new StringBuffer("Akshay");
		
		StringBuffer s2= new StringBuffer("Akshay");
		
		System.out.println(s1==s2);			//Reference comparison

		System.out.println(s1.equals(s2)); // Content Comparison.....overridden for content
	
	}
}
