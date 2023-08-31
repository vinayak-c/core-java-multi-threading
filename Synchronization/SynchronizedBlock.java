package Synchronization;
class Display1
{
	public void wish(String name)
	{
		System.out.println("before: ");
		;;;;;;;
	    synchronized(Display1.class)
		{
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
			System.out.println(name);
		}
		}
		System.out.println("after");;;;;;;
	}
}

class MySyncDemo1 extends Thread
{
	Display1 d;
	String name;
	public MySyncDemo1(Display1 d,String name) {
		// TODO Auto-generated constructor stub
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class SynchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display1 d=new Display1();
		Display1 d1=new Display1();
		MySyncDemo1 s=new MySyncDemo1(d,"Vinny");
		MySyncDemo1 s1=new MySyncDemo1(d1,"Binny");
		s.start();
		s1.start(); 
		

	}

}
