package Thread;

class MyThreading extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("overriden start method");
	}
	
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child thread");
		}
	}
}
public class OverridingStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThreading t=new MyThreading ();
        t.start();
        for(int i=0;i<5;i++)
        {
        System.out.println("main thread");
        }

	}

}
