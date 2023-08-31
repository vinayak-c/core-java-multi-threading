package Thread;

class MyRunnable implements Runnable
{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("child thread");
		}	
	}
}

public class ThreadWithRunnable extends MyRunnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<5;i++)
		{
			System.out.println("Main thread");
		}	         
	}
}
