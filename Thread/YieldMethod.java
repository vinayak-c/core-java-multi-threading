package Thread;
class MyYield extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("run method called by"+" "+Thread.currentThread().getName());
		}
	}
}

public class YieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyYield y=new MyYield();
		y.setPriority(10);
		y.start();
		for(int i=0;i<5;i++)
		{
			Thread.yield();
			System.out.println("run method called by thread"+" "+Thread.currentThread().getName());
		}

	}

}
