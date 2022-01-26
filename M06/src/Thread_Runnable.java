
class MyThread3 implements Runnable
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Chiled Thread");
		}
	}
}
public class Thread_Runnable {

	public static void main(String[] args) {
		
		MyThread3 mt3 = new MyThread3();
		Thread t = new Thread(mt3);
		
		t.start();
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Main Thread");
		}

	}

}
