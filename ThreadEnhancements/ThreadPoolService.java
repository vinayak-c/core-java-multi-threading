package ThreadEnhancements;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable
{
	String name;
	PrintJob(String name)
	{
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println(name+" job started by thread: "+Thread.currentThread().getName());
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e){}
		System.out.println(name+" job completed by thread: "+Thread.currentThread().getName());
	}
}
public class ThreadPoolService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintJob jobs[]= {
				           new PrintJob("Vinayak"),
				           new PrintJob("Rishabh"),
				           new PrintJob("Navin"),
				           new PrintJob("Sunny"),
				           new PrintJob("Adam"),
				           new PrintJob("Post"),
				           };
				           
		ExecutorService service=Executors.newFixedThreadPool(5);
		for(PrintJob job:jobs)
		{
			service.submit(job);
		}
        service.shutdown();
	}

}
