package exceptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map<Employee, Integer> map = new HashMap<>();

		// map.values().stream().reduce(0, (Integer a, Integer b) -> Integer.max(a, b));

		// Get second highest value from hashmap using stream API
		// produce concurrentmodification exception
		// N+1 issue in Hibernate
		// Early loading and Lazy loading
		// How do you manage transaction across microservices
		// If one fails, what happens
		// Various annotations in Spring
		// Put and patch difference

		List<Integer> list = new ArrayList<>();  
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
        list.add(5);  

        //List<Integer> list = Arrays.asList(1, 2, 3, 4);
        
        System.out.println(list.getClass());
        
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals(3))
				list.remove(value);
		}

		for (Integer i : list) {
			list.remove(i);
		}

	}

}
