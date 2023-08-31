package Thread;

class ThreadPriorityDemo extends Thread {

	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("child thread");
		}
	}
}
//extends Thread
public class GettingSettingPriority  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());

		GettingSettingPriority t1=new GettingSettingPriority();
		GettingSettingPriority t2=new GettingSettingPriority();
		System.out.println("t1 thread"+t1.getName()+" "+t1.getPriority());
		System.out.println("t2 thread"+t2.getName()+" "+t2.getPriority());

		t1.setPriority(7);
		t2.setPriority(9);

		System.out.println("t1 thread"+t1.getName()+" "+t1.getPriority());
		System.out.println("t2 thread"+t2.getName()+" "+t2.getPriority());*/
		ThreadPriorityDemo t1=new ThreadPriorityDemo();
		t1.setPriority(10);
		t1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}

	}

}
