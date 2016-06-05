package java_lab_5.pasha.threads2;

import java_lab_5.pasha.threads.MyPanel4;

public class ProcessorLab4 {

	private static int number = 0;
	private String result = "";
	private final Object lock = new Object();

	public String produce() throws InterruptedException {

		synchronized (lock) {
			number = number + 10;

			result = result + number + " produce" + "\n";
			System.out.println(result);
			
			lock.notify();
			lock.wait();
		}
		return result;
	}

	public String consume() throws InterruptedException {

		synchronized (lock) {
			number = number + 1000;
			
			result = result + number + " consume" + "\n";
			System.out.println(result);
			lock.notify();
			lock.wait();
		}
		return result;
	}
}
