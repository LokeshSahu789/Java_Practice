package collections.custom;

import collections.custom.queue.CustomQueue;
import collections.custom.queue.QueueUsingAL;
import collections.custom.queue.QueueUsingArray;
import collections.custom.queue.QueueUsingLL;

public class TestCustomQueue {

	public static void main(String[] args) {

		CustomQueue queue = new QueueUsingLL();
		
		// print Queue elements
        queue.display();

        // inserting elements in the queue
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // print Queue elements
        queue.display();

        // insert element in the queue
        queue.enqueue(60);

        // print Queue elements
        queue.display();

        queue.dequeue();
        queue.dequeue();
        System.out.printf(
            "\nafter two node deletion\n");

        // print Queue elements
        queue.display();

        // print front of the queue
        queue.front();
		
		
	}

}
