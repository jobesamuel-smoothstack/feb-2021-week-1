package com.ss.day.four;

/**
 * @author Jobe Samuel
 *
 */
public class DeadlockExample {
	// Main Thread
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();

		// Thread A
		Runnable thread1 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (car1) {
						System.out.println("Thread A with Lock 1, waiting on Lock 2");
						Thread.sleep(100);
						synchronized (car2) {
							System.out.println("Thread A with Lock 1 and Lock 2");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		// Thread B
		Runnable thread2 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (car2) {
						System.out.println("Thread B with Lock 2, waiting on Lock 1");
						Thread.sleep(100);
						synchronized (car1) {
							System.out.println("Thread B with Lock 2 and Lock 1");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		new Thread(thread1).start();
		new Thread(thread2).start();
	}
}
