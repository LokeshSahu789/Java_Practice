package java8.streams;

import java.util.stream.IntStream;

public class PrintPrime {

	public static void main(String[] args) {
		
		for(int i = 1; i<=100; i++)
		{
			int num = i;
			boolean isPrime = IntStream.range(2, (num/2) + 1).noneMatch(n -> num%n == 0);
			if (isPrime) {
				System.out.print(num + " ");
			}
			
		}
		

	}

}
