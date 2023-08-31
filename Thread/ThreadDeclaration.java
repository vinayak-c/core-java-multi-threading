package Thread;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("No Arg Child Thread");
		}
	}
	
	public void run(int j)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Arg Child Thread");
		}
	}
}
public class ThreadDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m=new MyThread();
		m.start();
		/*for(int i=0;i<10;i++)
		{
			System.out.println("Parent Thread");
		}*/
	} 
}
