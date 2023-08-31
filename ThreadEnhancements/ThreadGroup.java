package ThreadEnhancements;

public class ThreadGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		java.lang.ThreadGroup g=new java.lang.ThreadGroup("FirstGroup");
		System.out.println(g.getParent().getName());
		java.lang.ThreadGroup g1=new java.lang.ThreadGroup(g,"SecondGroup");
		System.out.println(g1.getParent().getName());
		Thread t1=new Thread(g1,"first");
		g1.setMaxPriority(2);//priority of t1 unaffected
		Thread t2=new Thread(g1,"second");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		g.list();
		java.lang.ThreadGroup s=Thread.currentThread().getThreadGroup().getParent();
		Thread[] t=new Thread[s.activeCount()];
		s.enumerate(t);
		for(Thread td:t)
		{
			System.out.println(td.getName()+" "+td.isDaemon());
		}
	
	}
	

}
