package java8;
public class Java8Demo2 {

	interface FuncInter1
	{
		int operation(int a, int b);
	}
	
	interface FuncInter2
	{
		void sayMessage(String mesage);
	}
	
	private int operate(int a, int b, FuncInter1 fObj)
	{
		return fObj.operation(a, b);
	}
	
	public static void main(String[] args) {
		
		FuncInter1 add = (int a, int b) -> a + b;
		
		FuncInter1 multiply = (int a, int b) -> a * b;
		
		Java8Demo2 test = new Java8Demo2();
		
		System.out.println("Addition is: " + test.operate(6, 3, add));
		
		System.out.println("Multiplication is: " + test.operate(6, 3, multiply));
		
		FuncInter2 obj = message -> System.out.println("Hello " + message);
		
		obj.sayMessage("Testing");
		
	}
		
}
