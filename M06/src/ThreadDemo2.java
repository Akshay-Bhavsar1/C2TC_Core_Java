
class MyThread2 extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Chiled Thread");
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		
		MyThread2 mt2 = new MyThread2();
		mt2.start();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("MainThread");
		}

	}

}
