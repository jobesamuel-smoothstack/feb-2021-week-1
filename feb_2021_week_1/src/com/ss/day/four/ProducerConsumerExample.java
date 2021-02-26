package com.ss.day.four;

/**
 * @author Jobe Samuel
 *
 */
public class ProducerConsumerExample {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		ProducerConsumer producerConsumer = new ProducerConsumer();
		
		// Producer Thread
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producerConsumer.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Consumer Thread
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producerConsumer.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start threads
		thread1.start();
		thread2.start();

		// When using "join" the calling thread goes into a waiting state. It remains in
		// a waiting state until the referenced thread terminates
		thread1.join();
		thread2.join();
	}
}
