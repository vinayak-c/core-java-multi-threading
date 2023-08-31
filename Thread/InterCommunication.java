package Thread;
class Inter extends Thread
{
	int total;
	public void run()
	{
		synchronized(this)
		{
		System.out.println("child starts calculation");
		for(int i=1;i<=100;i++)
		{
			total=total+i;
		}
		System.out.println("child giving notification call");
		this.notify();
		}
	}
}
public class InterCommunication  {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Inter i=new Inter();
		i.start();
		//Thread.sleep(10000); if called then main thread will always be in waiting state as 
		//child thread notify has already been executed.
		synchronized(i)
		{
			System.out.println("Main Thread calling wait method");
			i.wait();
			System.out.println("Main Thread got notification call");
			System.out.println(i.total);
		}
		
	}

}
