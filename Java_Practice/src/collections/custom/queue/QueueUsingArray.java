package collections.custom.queue;

public class QueueUsingArray implements CustomQueue {
	
	int capacity;
	int queue[];
	int front;
	int rear;
	
	public QueueUsingArray(int capacity)
	{
		this.capacity = capacity;
		queue = new int[capacity];
		front = 0;
		rear = 0;
	}
	
	public boolean isEmpty()
	{
		return front == rear;
	}
	
	public boolean isFull()
	{
		return rear == capacity;
	}
	
	public void enqueue(int pushedElement)
	{
		if(!isFull())
		{
			queue[rear] = pushedElement;
			rear++;
			System.out.println("\nPushed element: " + pushedElement);
		}
		else
		{
			System.out.println("Queue is Full");
		}
	}
	
	public int dequeue()
	{
		if(!isEmpty())
		{
			int poppedElement = queue[front];
			System.out.println("\nPopped element: " + poppedElement);
			
			for (int i = 0; i < rear; i++) {
				queue[i] = queue[i+1];	
			}
			
			if (rear < capacity) {
				queue[rear] = 0;
			}
			
			rear--;
			
			return poppedElement;
		}
		else
		{
			System.out.println("Queue is Empty");
			return -1;
		}
	}
	
	public int front()
	{
		if(!isEmpty())
		{
			System.out.println("\nElement on front of Queue: " + queue[front]);
			return queue[front];
		}
		else
		{
			System.out.println("Queue is Empty");
			return -1;
		}
	}
	
	@Override
	public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (int i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
		
	}
	
	
	
}
