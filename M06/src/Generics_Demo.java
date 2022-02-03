
public class Generics_Demo {

	public static void main(String[] args) {
		
		Container<Integer> obj = new Container<Integer>();
	
		obj.value = 1;
		
		obj.show();
		System.out.println();
		
		Container<Character> obj1 = new Container<Character>();
		obj1.value = 'A';
		
		obj1.show();
		System.out.println();
		
		Container<String> obj2 = new Container<String>();
		obj2.value = "Akshay";
		
		obj2.show();
		
	

	}

}


class Container<T>
{
	T value;
	
	public void show()
	{
		System.out.println(value);
		System.out.println(value.getClass());
		System.out.println(value.getClass().getName());


	}
}