
class MyThread1 extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		
		MyThread1 mt = new MyThread1();
		mt.start();
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Main Thread");
		}

	}

}
