import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = in.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter the array elements : ");
		for(int i = 0; i < size; i++)
		{
			array[i] = in.nextInt();
		}
		
		System.out.print("Array Elements : ");
		for(int i = 0; i < size; i++)
		{
			System.out.print(array[i]+"	");
		}
	}

}
