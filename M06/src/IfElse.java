import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.printf("Enter an Number : ");
		int input = in.nextInt();
		
		if(input%2 == 0)
		{
			System.out.printf("%d number is Even number",input);
		}
		else
		{
			System.out.printf("%d number is Odd number",input);
		}

	}

}
