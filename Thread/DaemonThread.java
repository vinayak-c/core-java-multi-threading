package Thread;

public class DaemonThread extends Thread{

	public DaemonThread(String name)
	{
		super(name);
	}
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(getName()+" is Daemon Thread");
		}
		else
		{
			System.out.println(getName()+" is User Thread");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread t1=new DaemonThread("T1");
		DaemonThread t2=new DaemonThread("T2");
		DaemonThread t3=new DaemonThread("T3");
		t1.setDaemon(true);
		t1.start();
		t2.start();
		

	}

}
