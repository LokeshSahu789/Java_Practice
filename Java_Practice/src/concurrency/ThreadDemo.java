package concurrency;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

//Java program for multitasking
class MyThread extends Thread {
 public void run()
 {
     // Code to be executed in this thread
	 for (int i = 0; i < 10; i++) {
         System.out.println(" Running thread : " + i);
         try {
             Thread.sleep(100);
         }
         catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

class MyThread1 implements Runnable {
	 public void run()
	 {
	     // Code to be executed in this thread
	     for (int i = 0; i < 10; i++) {
	         System.out.println("Thread with implements " + Thread.currentThread().getId() + ": " + i);
	         try {
	             Thread.sleep(100);
	         }
	         catch (InterruptedException e) {
	             e.printStackTrace();
	         }
	     }
	 }
	}

public class ThreadDemo {
 public static void main(String[] args) throws InterruptedException
 {
//     MyThread thread1 = new MyThread();
//     MyThread1 thread2 = new MyThread1();
//     // Start the threads
//     thread1.start();
//     //thread1.wait();
//     //thread1.notify();
//     thread2.run();
	 
	 Vector a = new Vector(21);
	 a.add(1);
	 a.add(10);
	 a.add(2);
     Vector b = new Vector(2);
     Vector c = new Vector(219);
     System.out.println("Memory Leak in Java");
     //LinkedList<E>
     
     Collections.sort(a);
     System.out.println(a);
	 
	 MyThread1 t2 = new MyThread1();
	 
	 MyThread t1 = new MyThread();
	 t1.setPriority(1);
     t1.start();
     t2.run();
     t1.join();
     try {
         Thread.sleep(500);
     }
     catch (InterruptedException e) {
         e.printStackTrace();
     }
     // suspend the execution of the thread
     t1.suspend();
     System.out.println("Suspended thread ");
     try {
         Thread.sleep(1000);
     }
     catch (InterruptedException e) {
         e.printStackTrace();
     }
     // resume the execution of the thread
     t1.resume();
     t1.join();
     System.out.println("Resumed thread");
	 
 }
}