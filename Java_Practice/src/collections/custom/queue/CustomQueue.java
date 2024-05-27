package collections.custom.queue;

public interface CustomQueue {
	public boolean isEmpty();
	public void enqueue(int pushedElement);
	public int dequeue();
	public int front();
	public void display();
}
