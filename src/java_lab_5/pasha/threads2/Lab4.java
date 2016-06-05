package java_lab_5.pasha.threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import java_lab_5.pasha.threads.MyPanel4;

public class Lab4 {
	
    private static String result = "";
    
	public static void start() throws InterruptedException {
		final ProcessorLab4 processorLab4 = new ProcessorLab4();
		
   
		int studentThreads = 5;
		int proffesorThreads = 5;

		ExecutorService threadPool = Executors.newFixedThreadPool(studentThreads);
		ExecutorService threadPool2 = Executors.newFixedThreadPool(proffesorThreads);

		threadPool.submit(new Runnable() {
			public void run() {
				System.out.println("WORK1");
				try {
					for (int i = 0; i < studentThreads; i++) {
						result = result + processorLab4.produce();
						MyPanel4.textArea_1.setText(result);
					}
				} catch (InterruptedException ignored) {
					ignored.printStackTrace();
				}
			}
		});

		threadPool2.submit(new Runnable() {
			public void run() {
				System.out.println("WORK2");
				try {
					for (int i = 0; i < proffesorThreads; i++) {
						result = result + processorLab4.consume();
						MyPanel4.textArea_1.setText(result);						
					}
				} catch (InterruptedException ignored) {
					ignored.printStackTrace();
				}
			}
		});

		threadPool.shutdown();
		threadPool2.shutdown();
		
		
		// wait for finish
		try {
			threadPool.awaitTermination(5000, TimeUnit.MILLISECONDS); //Long.MAX_VALUE
			threadPool2.awaitTermination(5000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
}
