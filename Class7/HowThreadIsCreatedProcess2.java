package Class7;

public class HowThreadIsCreatedProcess2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HowThreadIsCreatedProcess2 obj = new HowThreadIsCreatedProcess2();
		Thread t1 = new Thread(obj);
		t1.start();
		
	}

	@Override
	public void run() {
		System.out.println("I also got called Automatically");
		
	}

}
