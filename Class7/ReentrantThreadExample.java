package Class7;

class Reenterant {

	public synchronized void m() {

		n();

		System.out.println("I am in m synchronised method");

	}

	public synchronized void n() {

		System.out.println("I am in n synchronised method");

	}

}

public class ReentrantThreadExample {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		final Reenterant r = new Reenterant();

		new Thread() {

			public void run() {

				r.m();

			}

		}.start();

	}

}
