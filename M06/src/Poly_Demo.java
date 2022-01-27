
public class Poly_Demo {

	void m()
	{
		System.out.println("No Parameters");
	}
	
	void m(int i)
	{
		System.out.println("Integer Parameters");
	}
	
	void m(double d)
	{
		System.out.println("Double Parameters");
	}
	
	public static void main(String[] args) {
	
		Poly_Demo p = new Poly_Demo();
		
		p.m();
		
		p.m(32);
		
		p.m(32.32);

	}

}
