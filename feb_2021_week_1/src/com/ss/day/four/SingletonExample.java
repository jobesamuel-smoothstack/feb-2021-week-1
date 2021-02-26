package com.ss.day.four;

/**
 * @author Jobe Samuel
 *
 */
public class SingletonExample {

	/**
	 * Volatile used for thread safety meaning multiple threads can uses the
	 * instance or method at the same time.
	 */
	private static volatile SingletonExample instance;

	/**
	 * Private constructor used for Singleton design pattern to prevent from
	 * creating more than one instance.
	 */
	private SingletonExample() {

	}

	/**
	 * Double-Checked Locking reduces the number of lock acquisitions by simply checking the
	 * locking condition beforehand leading to a boost in performance.
	 * @return
	 */
	public static SingletonExample getInstance() {
		if (instance == null) {
			synchronized (SingletonExample.class) {
				if (instance == null) {
					instance = new SingletonExample();
				}
			}
		}
		return instance;
	}
}
