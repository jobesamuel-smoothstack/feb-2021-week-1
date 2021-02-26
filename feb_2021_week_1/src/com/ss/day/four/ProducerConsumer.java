package com.ss.day.four;

import java.util.LinkedList;

public class ProducerConsumer {

	// LinkedList faster than using array when manipulating data because bits are
	LinkedList<Integer> buffer = new LinkedList<>();
	int capacity = 7;

	// Produce
	public void produce() throws InterruptedException {
		// Value to be added by producer to buffer
		int value = 0;
		while (true) {
			synchronized (this) {
				// Waits until list is full
				while (buffer.size() == capacity) {
					wait();
				}

				System.out.println("[Producer] Added: " + value);
				
				// Add different value to buffer to keep track of what is being added and consumed in example
				buffer.add(value++);

				// Notifies consumer thread that it can take from buffer
				notify();
				
				// Easier for user to understand with slower printing in console.
				Thread.sleep(1000);
			}
		}
	}

	// Consume
	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				// If buffer is empty consumer thread will wait
				while (buffer.size() == 0) {
					wait();
				}

				// Remover first value in buffer
				int value = buffer.removeFirst();

				System.out.println("[Consumer] Removed: " + value);

				// Notify consumer thread that value has been taken from buffer
				notify();

				Thread.sleep(1000);
			}
		}
	}
}
