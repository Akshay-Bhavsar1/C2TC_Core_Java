import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {

		int n, i, j, space = 0;
		System.out.print("Enter the number of rows: ");
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
	
		for (j = 1; j<= n ; j++)
		{
			for (i = 1; i<= space; i++)
			{
				System.out.print(" ");
			}          
	
			space++;
			for (i = 1; i<= 2 * (n - j) - 1; i++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
