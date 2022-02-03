import java.util.Scanner;

public class Neon_OR_Not {

	public static void main(String[] args) {
		
		int num, sqr, sum_of_digit = 0;
		
		System.out.println("Enter the Number : ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		sqr = num * num;
		int sqr1 = sqr;
		while(sqr > 0)
		{
			sum_of_digit = sum_of_digit + sqr%10;
			//sqr = sqr//10;
			sqr = Math.floorDiv(sqr, 10);
				
		}
		
		
		System.out.printf("\nFloor Division of %d // 10 : %d \n",sqr1, sqr);
		System.out.printf("sum_of_digit : %d \n\n",sum_of_digit);
		
		if(num == sum_of_digit)
		{
			System.out.printf("%d == %d \n", num,sum_of_digit);
			System.out.println("Neon Number");
		}
		else
		{
			System.out.printf("%d != %d \n", num,sum_of_digit);
			System.out.println("Not a Neon Number");
		}

	}

}
