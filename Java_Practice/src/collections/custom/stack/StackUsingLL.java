package collections.custom.stack;

public class StackUsingLL implements CustomStack {
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
		
	}

	Node head = null;
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void push(int pushedElement)
	{
		Node newNode = new Node(pushedElement);
		// If LL is empty, then assign newNode to head directly
		if (isEmpty()) {
			head = newNode;
		}
		//Since, in stack, elements are added from top
		newNode.next = head; //the current head will be stored in next of new node
		head = newNode; //new node will be declared as head
		System.out.println("Pushed element: " + pushedElement);
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int poppedElement = head.data;
			head = head.next; // Since current head is popped, new head is current head's next element
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
			int topElement = head.data;
			System.out.println("Element on top of Stack: " + topElement);
			return topElement;
			
		}
		else
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
}
