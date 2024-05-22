package concurrency;
import java.util.LinkedList;

public class ProducerConsumer {
	
	public static void main(String[] args) throws InterruptedException {
		
		PC pc = new PC();
		
		Thread producerThread = new Thread(() -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread consumerThread = new Thread(() -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		producerThread.start();
		consumerThread.start();	
		
		producerThread.join();
		consumerThread.join();	
		
	}
	
	
	public static class PC
	{
		
		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;
		
		void produce() throws InterruptedException
		{
			int value = 0;
			
			while (true) {
				synchronized (this) {
					while (list.size() == capacity) 
						wait();
					
					System.out.println(Thread.currentThread().getName() + ": Producer produced: " + String.valueOf(value));
					
					list.add(value++);
					
					notify();
					
					Thread.sleep(500);
				}
			}				
		}
		
		
		void consume() throws InterruptedException
		{
			
			while (true) {
				synchronized (this) {
					while (list.size() == 0) 
						wait();
					
					int value = list.removeFirst();
					
					System.out.println(Thread.currentThread().getName() + ": Consumer consumed: " + String.valueOf(value));
					
					notify();
					
					Thread.sleep(500);
				}
			}			
			
		}
		
		
	}
	
	
}
