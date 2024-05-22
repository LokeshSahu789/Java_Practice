package collections.custom.stack;

import java.util.ArrayList;
import java.util.List;

public class StackUsingAL implements CustomStack {
	
	List<Integer> list = new ArrayList<Integer>();
	
	public boolean isEmpty()
	{
		return list.size() == 0;
	}
	
	public void push(int pushedElement)
	{
		list.add(pushedElement);
		System.out.println("Pushed element: " + pushedElement);
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int poppedElement = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			System.out.println("Popped element: " + poppedElement);
			return poppedElement;
		}
		else
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	public int peek()
	{
		if(!isEmpty())
		{
			System.out.println("Element on top of Stack: " + list.get(list.size() - 1));
			return list.get(list.size() - 1);
		}
		else
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	
	
}
