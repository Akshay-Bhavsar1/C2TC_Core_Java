class MyThread extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Warrrrrrr");
		}
		try 
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThread m = new MyThread();
		m.start();
		
		
		m.join(4000);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Peaceeeee");
		}
	}

}
