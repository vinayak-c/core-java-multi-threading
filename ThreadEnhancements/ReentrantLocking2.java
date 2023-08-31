package ThreadEnhancements;

import java.util.concurrent.locks.ReentrantLock;

class MyRe extends Thread
{
	static ReentrantLock l=new ReentrantLock();
	MyRe(String name)
	{
		super(name);
	}
	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+" got lock and performing safe");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{}
			l.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" did not get lock and performing alternative");
		}
	}
}
public class ReentrantLocking2 {

	public static void main(String[] args) {
		MyRe t1=new MyRe("T1");
		MyRe t2=new MyRe("T2");
		t1.start();
		t2.start();
	}
}
