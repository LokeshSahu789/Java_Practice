package basics;

public class Calculator {

	int num = 100;
	public void calc(int num) {this.num = num * 10;}
	public void printNum() { System.out.println(num); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj = new Calculator();
		obj.calc(3);
		obj.printNum();

	}

}
