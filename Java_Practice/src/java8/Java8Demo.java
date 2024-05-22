package java8;

public class Java8Demo {
	public static void main(String args[])
    {
        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
        
     // create anonymous inner class object
        new Thread(() -> System.out.println("New thread 1 created")).start();
    }
}



@FunctionalInterface
interface Square {
    int calculate(int x);
}
 
class Test {
    public static void main(String args[])
    {
        int a = 5;
 
        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;
 
        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}