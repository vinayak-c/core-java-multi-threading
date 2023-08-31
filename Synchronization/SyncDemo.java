package Synchronization;
class Display
{
//	public static synchronized void wish(String s)
//	{
//		//after removing static if we access this method from 2 threads then irregular o/p will be 
//		//generated
//		for(int i=0;i<5;i++)
//		{
//			System.out.print("Good Evening: ");
//			try
//			{
//				Thread.sleep(1000);
//			}
//			catch(Exception e)
//			{
//			}
//			System.out.println(s);
//		}
//	}
	public synchronized void wish(String s)
	{
		//after removing static if we access this method from 2 threads then irregular o/p will be 
		//generated
		for(int i=0;i<5;i++)
		{
			System.out.print("Good Evening: ");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
			System.out.println(s);
		}
	}
}
class MySyncDemo extends Thread
{
	Display d;
	String name;
	public MySyncDemo(Display d,String name) {
		// TODO Auto-generated constructor stub
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display d=new Display();
		Display d1=new Display();
		MySyncDemo s=new MySyncDemo(d1,"Vinny");
		MySyncDemo s1=new MySyncDemo(d1,"Rishabh");
		s.start();
		s1.start();

	}

}
