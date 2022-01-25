
public class ForEach {

	public static void main(String[] args) {
		int[] x[] = {{33,4,5},{7,4,78,43}};
	
		for(int[] x1 : x)
		{
			
			for(int x2 : x1)
			{
				System.out.print(x2+", ");
			}
			System.out.println();
		}
	}

}
