package ThreadEnhancements;
class CustomerThread extends Thread
{
	static int custid=0;
	private static ThreadLocal<Integer> tl=new ThreadLocal<Integer>()
     {
		public Integer initialValue()
		{
			return custid++;
		}
	 };
	 public CustomerThread(String name) {
		 super(name);
	 }
	 
	 @Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" executing with custId: "+tl.get());
	}
}
public class TheadLocalDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerThread t1=new CustomerThread("C1");
		CustomerThread t2=new CustomerThread("C2");
		CustomerThread t3=new CustomerThread("C3");
		t1.start();
		t2.start();
		t3.start();
		//for every thread a separate custid will be maintained by ThreadLocol
	}

}
