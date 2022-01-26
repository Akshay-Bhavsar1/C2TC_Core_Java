import java.util.Scanner;

public class UserDefineException
{

	public static void main(String[] args) throws CantVote 
	{

		int age;
		System.out.println("Enter the age : ");
		Scanner in = new Scanner(System.in);
		age = in.nextInt();
		
		if(age < 10)
		{
			throw new CantVote("You cannot cast your vote....");
			
		}
		else
		{
			System.out.println("You can happily vote");
			
		}

	}
}

class CantVote extends Exception
{
	CantVote(String msg)
	{
		super(msg);
	}
}
