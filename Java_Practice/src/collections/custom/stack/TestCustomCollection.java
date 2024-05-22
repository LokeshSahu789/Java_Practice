package collections.custom.stack;

public class TestCustomCollection {

	public static void main(String[] args) {

		CustomStack stack = new StackUsingAL();
		
		stack.pop();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.pop();
		stack.pop();
		
		stack.peek();
		
		stack.pop();
		
		stack.peek();
		
		stack.push(10);
		stack.push(20);
		stack.push(10);
		stack.push(20);
		
		stack.pop();
		
		stack.peek();
		
		stack.pop();
		
		stack.peek();
		
		
	}

}
