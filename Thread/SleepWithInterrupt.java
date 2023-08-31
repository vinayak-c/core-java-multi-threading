package Thread;
class MySleep extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
			System.out.println("run thread");
			Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Got Interrupted");
		}
	}
}
public class SleepWithInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySleep s=new MySleep();
		s.start();
		s.interrupt();
        System.out.println("executed by main thread");
	}

}
