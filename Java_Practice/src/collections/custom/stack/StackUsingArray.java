package collections.custom.stack;

public class StackUsingArray implements CustomStack {
	
	int n;
	int arr[];
	int top;
	
	StackUsingArray(int n)
	{
		this.n = n;
		arr = new int[n];
		top = -1;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == n-1;
	}
	
	public void push(int pushedElement)
	{
		if(!isFull())
		{
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element: " + pushedElement);
		}
		else
		{
			System.out.println("Stack is Full");
		}
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int poppedElement = arr[top];
			top--;
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
			System.out.println("Element on top of Stack: " + arr[top]);
			return arr[top];
		}
		else
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	
	
}
