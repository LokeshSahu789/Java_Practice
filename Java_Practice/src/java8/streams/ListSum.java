package java8.streams;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListSum implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		
		Integer sum = integers.stream().reduce(0, (a,b) -> a+b);
		
		Integer sum1 = integers.stream().reduce(0, Integer::sum);
		
		Integer sum2 = integers.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum2);
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 12);
		map.put(2, 24);
		map.put(3, 10);
		  
		Integer keySum = map.keySet().stream().mapToInt(Integer::intValue).sum();
		
		Integer valueSum = map.values().stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(keySum + " " + valueSum);
		
		Collections.sort(integers, (a,b) -> a>b ? -1 : a<b ? 1 : 0);
		
		System.out.println(integers);
		
		Object obj = new Object();
		System.out.println(obj.getClass());
		
		 
		
		System.out.println(new ListSum().clone());
		
		
		
	}
	
}
