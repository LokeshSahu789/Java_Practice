package collections.custom.queue;

public class QueueUsingLL implements CustomQueue {
	
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

	Node front, rear;
	
	public QueueUsingLL()
	{
		this.front = this.rear = null;
	}
	
	public boolean isEmpty()
	{
		return this.rear == null && this.rear == null;
	}
	
	public void enqueue(int pushedElement)
	{
		Node newNode = new Node(pushedElement);
		// If LL is empty, then assign newNode to head directly
		
		if (this.rear == null) {
			//If queue is empty, then both front and rear will point to new node
			this.front = this.rear = newNode;
		}
		
		//Since, in queue, elements are added from read
		
		this.rear.next = newNode; //the new node will be stored in next of rear node
		this.rear = newNode; //new node will be declared as rear node
		
		System.out.println("Queued element: " + pushedElement);
	}
	
	public int dequeue()
	{
		if(this.front != null)
		{
			int poppedElement = this.front.data;
			this.front = this.front.next; // Since front is popped, new front is current front's next element
			System.out.println("Dequeued element: " + poppedElement);
			
			// If front becomes NULL, then change rear also as null
			if (this.front == null) {
				this.rear = null;
			}
			
			return poppedElement;			
		}
		else
		{
			System.out.println("Queue is Empty 3");
			return -1;
		}
	}
	
	public int front()
	{
		if(this.front != null)
		{
			int topElement = this.front.data;
			System.out.println("Element in front of Queue: " + topElement);
			return topElement;
			
		}
		else
		{
			System.out.println("Queue is Empty 2");
			return -1;
		}
	}

	public void display() {
		
		if (this.front == null) {
            System.out.println("Queue is Empty 1\n");
            return;
        }

		Node curr = front;
		
        // traverse front to rear and print elements
        while(curr != null) {
            System.out.printf(" %d <-- ", curr.data);
            curr = curr.next;
        }
        System.out.println();
        return;
		
	}
	
}
