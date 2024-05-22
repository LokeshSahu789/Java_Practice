package concurrency;

public class PrintOddAndEven {

	int counter = 1;
	
	static int N;
	
	void printOddNumbers()
	{
		
		synchronized (this) {
			while (counter < N) {
				
				while (counter % 2 == 0) {
					
					try {
						Thread.sleep(500);
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
				System.out.println(Thread.currentThread().getName() + ": " + String.valueOf(counter));
				
				counter++;
				
				notify();
				
			}
		}
		
	}
	
	void printEvenNumbers()
	{
		
		synchronized (this) {
			while (counter < N) {
				
				while (counter % 2 == 1) {
					
					try {
						Thread.sleep(500);
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
				System.out.println(Thread.currentThread().getName() + ": " + String.valueOf(counter));
				
				counter++;
				
				notify();
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		N = 50;
		
		PrintOddAndEven pc = new PrintOddAndEven();
		
		Thread evenThread = new Thread(() -> pc.printEvenNumbers());
		
		Thread oddThread = new Thread(() -> pc.printOddNumbers());
		
		evenThread.start();
		oddThread.start();
		
		
	}
	
}
