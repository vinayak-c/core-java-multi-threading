package ThreadEnhancements;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyRe1 extends Thread {
	static ReentrantLock l = new ReentrantLock();

	MyRe1(String name) {
		super(name);
	}

	public void run() {
		do {
			try {
				if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + " got lock and performing safe");
					Thread.sleep(30000);
					l.unlock();
					System.out.println(Thread.currentThread().getName() + " releases lock");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + " did not get lock and performing retry");
				}
			} catch (Exception e) {
			}
		} while (true);
	}
}

public class ReentrantLocking3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRe1 t1 = new MyRe1("T1");
		MyRe1 t2 = new MyRe1("T2");
		t1.start();
		t2.start();
	}
}
