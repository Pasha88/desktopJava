package java_lab_5.pasha.class_interface;

import java_lab_5.pasha.threads.MyPanel2;
import java_lab_5.pasha.threads.MyPanel3;

public class Processor {

	private static int number = 0;
	private String result = "";
	private final Object lock = new Object();

	public void produce() throws InterruptedException {
		while (number < 4000) {
			synchronized (lock) {
				number = number + 10;

				result = result + number + " produce" + "\n";
				MyPanel3.textPane.setText(result);

				lock.notify();
				lock.wait();
			}
		}
	}

	public void consume() throws InterruptedException {

		while (number < 4000) {
			synchronized (lock) {
				number = number + 1000;

				result = result + number + " consume" + "\n";
				MyPanel3.textPane.setText(result);

				lock.notify();
				lock.wait();
			}
		}
	}
}
