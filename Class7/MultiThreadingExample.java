package Class7;

import java.util.concurrent.Executor;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

import java.util.concurrent.TimeUnit;

class workerThread implements Runnable {

	private String message;

	public workerThread(String s) {

		this.message = s;

	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + " start : " + message);

		try {

			Thread.sleep(2000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		System.out.println(Thread.currentThread().getName() + " end ");

	}

	public class MultiThreadingExample {

		public static void main(String[] args) {

			// TODO Auto-generated method stub

			ExecutorService executor = Executors.newFixedThreadPool(100);

			for (int i = 1; i < 10; i++) {

				Runnable worker = new workerThread(" " + i);

				executor.execute(worker);

			}

			System.out.println("Try to Shutdown executors");

			executor.shutdown();

			try {

				executor.awaitTermination(5, TimeUnit.SECONDS);

			} catch (InterruptedException e) {

				System.out.println("Tasks interrupted");

			} finally {

				if (!executor.isTerminated()) {

					System.out.println("Cancel no - finished task");

				}

				executor.shutdown();

				System.out.println("ShutDown Ultimately Finished");

			}

		}

	}

}
