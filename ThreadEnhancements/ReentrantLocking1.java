package ThreadEnhancements;

import java.util.concurrent.locks.ReentrantLock;

class Display1
{
	ReentrantLock l=new ReentrantLock();
	public void wish(String s)
	{
		l.lock();
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
		l.unlock();
	}
}
class MyReentrantDemo extends Thread
{
	Display1 d;
	String name;
	public MyReentrantDemo(Display1 d,String name) {
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}
public class ReentrantLocking1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display1 d=new Display1();
		MyReentrantDemo s=new MyReentrantDemo(d,"Vinny");
		MyReentrantDemo s1=new MyReentrantDemo(d,"Binny");
		MyReentrantDemo s2=new MyReentrantDemo(d,"Sinny");
		s.start();
		s1.start();
		s2.start();
	}

}
