package Class7;

import java.util.concurrent.TimeUnit;

public class HowJointMethodsWorks extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HowJointMethodsWorks t1 = new HowJointMethodsWorks();
		HowJointMethodsWorks t2 = new HowJointMethodsWorks();
		HowJointMethodsWorks t3 = new HowJointMethodsWorks();
		
		t1.start();
		try {
			t1.join();
			
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Running Thread Name is " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
