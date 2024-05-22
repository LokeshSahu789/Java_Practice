package concurrency;
public class EvenOddWithThread{
	 
    int count = 1;
 
    static int N;
 
    public void printOddNumber() throws InterruptedException
    {
        synchronized (this)
        {
            while (count < N) {
 
             
                while (count % 2 == 0) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(count + " ");
                count++;
                Thread.sleep(1000);
                notify();
            }
        }
    }

    public void printEvenNumber() throws InterruptedException
    {
        synchronized (this)
        {
            while (count < N) {
                while (count % 2 == 1) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(count + " ");
                count++;
                Thread.sleep(1000);
                notify();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException
    {
        N = 1000;
        EvenOddWithThread myClass = new EvenOddWithThread();
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                try {
					myClass.printEvenNumber();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                try {
					myClass.printOddNumber();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        t1.start();
        t2.start();
    }
}