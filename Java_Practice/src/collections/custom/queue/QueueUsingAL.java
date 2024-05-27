package collections.custom.queue;

import java.util.ArrayList;
import java.util.List;

public class QueueUsingAL implements CustomQueue {
	
	List<Integer> list = new ArrayList<Integer>();
	
	public boolean isEmpty()
	{
		return list.size() == 0;
	}
	
	public void enqueue(int pushedElement)
	{
		list.add(pushedElement);
		System.out.println("\nQueued element: " + pushedElement);
	}
	
	public int dequeue()
	{
		if(!isEmpty())
		{
			int poppedElement = list.get(0);
			list.remove(0);
			System.out.println("\nDequeued element: " + poppedElement);
			return poppedElement;
		}
		else
		{
			System.out.println("List is Empty");
			return -1;
		}
	}
	
	public int front()
	{
		if(!isEmpty())
		{
			System.out.println("\nElement in front of List: " + list.get(0));
			return list.get(0);
		}
		else
		{
			System.out.println("List is Empty");
			return -1;
		}
	}

	
	public void display() {
		list.forEach((i) -> System.out.printf(" %d <-- ", i));
		
	}
	
	
	
}
