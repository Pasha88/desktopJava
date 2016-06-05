package java_lab_5.pasha.class_interface;

public class Lab3 {

	public static void start() throws InterruptedException {
		final Processor processor = new Processor();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					processor.produce();
				} catch (InterruptedException ignored) {
					ignored.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					processor.consume();
				} catch (InterruptedException ignored) {
					ignored.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
		// t1.join();
		// t2.join();

	}
}
