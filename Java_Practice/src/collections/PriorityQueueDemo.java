package collections;
// Java program to demonstrate the
// working of PriorityQueue
import java.util.*;
class PriorityQueueDemo {
    // Main Method
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> var1
            = new PriorityQueue<Integer>();
        // Adding items to the pQueue using add()
        var1.add(10);
        var1.add(20);
        var1.add(15);
        // Printing the top element of PriorityQueue
        
        System.out.println(var1);
        
        System.out.println(var1.peek());
        System.out.println(var1.poll());
        System.out.println(var1.peek());
        System.out.println(var1.poll());
        
        System.out.println(var1);
        
        Stack<Integer> s = new Stack<Integer>();
        s.push(120);
        s.push(120);
        s.push(120);
        
        System.out.println(s);
        s.forEach(p -> System.out.print(p + " "));
        
        System.out.println();
        
        
        Set<Integer> set = new LinkedHashSet<Integer>();
        set.add(500);
        set.add(500);
        set.add(5000);
        set.add(5000);
        set.add(50000);
        
        set.forEach(p -> System.out.println(p + " "));
        
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext())
        {
        	//set.remove(itr.next());
        	System.out.println(itr.next());
        }
        
        
    }
}
