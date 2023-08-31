package Thread;

class MyJoin1 extends Thread
{
	
	//child thread waiting until main thread completes
	//in this case child should call join on main thread reference
	static Thread  mt;
	public void run()
	{
		try
		{
			mt.join();
		}
		catch(InterruptedException e)
		{}
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class JoinCase2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		MyJoin1.mt=Thread.currentThread();
		MyJoin1 m=new MyJoin1();
		m.start();
//		m.join();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
