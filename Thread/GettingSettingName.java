package Thread;
class MyThreadN extends Thread
{
	@Override
	public void run() {
		System.out.println("Child run");
		Thread.currentThread().setName("Child Vinny");
		System.out.println(Thread.currentThread().getName());
	}
}
public class GettingSettingName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		MyThreadN n=new MyThreadN();
		n.start();
		System.out.println(n.getName());
		Thread.currentThread().setName("Vinny");
		System.out.println(Thread.currentThread().getName());
	
	}

}
