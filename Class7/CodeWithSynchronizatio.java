package Class7;

class SharedResource1 {

	synchronized void print(int n) {

		for (int i = 1; i < 5; i++) {

			System.out.println(n * i);

			try {

				Thread.sleep(i);

			} catch (InterruptedException e) {

				// TODO: handle exception

				e.printStackTrace();

			}

		}

	}

}

class MyThread3 extends Thread {

	SharedResource1 sR;

	MyThread3(SharedResource1 sR) {

		// TODO Auto-generated constructor stub

		this.sR = sR;

	}

	public void run() {

		sR.print(5);

	}

}

class MyThread4 extends Thread {

	SharedResource1 sR;

	MyThread4(SharedResource1 sR) {

		this.sR = sR;

	}

	public void run() {

		sR.print(10);

	}

}

public class CodeWithSynchronizatio {

	public static void main(String[] args) {

		SharedResource1 obj = new SharedResource1();

		MyThread3 t1 = new MyThread3(obj);

		MyThread4 t2 = new MyThread4(obj);

		t1.start();

		t2.start();

	}

}
