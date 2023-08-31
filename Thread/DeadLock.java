package Thread;
class A 
{
	public synchronized void d1(B b)
	{
		System.out.println("Thread 1 starts execution of d1");
	    try
	    {
	    	Thread.sleep(1000);
	    }
	    catch(InterruptedException e)
	    {}
	    System.out.println("T1 calling B last()");
	    b.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside A this is last method");
	}
}

class B 
{
    public synchronized void d2(A a)
    {
	System.out.println("Thread 2 starts execution of d2");
    try
    {
    	Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {}
    System.out.println("T2 calling A last()");
    a.last();
    }
    public synchronized void last()
    {
	System.out.println("Inside B this is last method");
    }
}

public class DeadLock extends Thread{

	A a=new A();
	B b=new B();
	public void m1()
	{
		this.start();
		a.d1(b);  //this line executed by main thread
	}
	
	public void run()
	{
		b.d2(a);  //this line executed by child thread
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock d=new DeadLock();
		d.m1();
	}
}
