package java8;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Demo8 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Pankaj",1);
	    map.put("Amit",2);
	    map.put("Rahul",5);
	    map.put("Chetan",9);
	    map.put("Vinod",8);
	    map.put("Rajesh", 8);
	    
	    //Find the second highest value from Map
	    
	    //Solution for single value
	    Map.Entry<String, Integer> entry =  map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
	    						.skip(1).findFirst().get();
		
		System.out.println(entry);
		
		//Solution for multiple value
		
		List<Entry<String, Integer>> result = map.entrySet().stream().collect(Collectors.groupingBy(e -> e.getValue())).entrySet().stream()
								.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
								.skip(1).findFirst().get().getValue();
		
		System.out.println(map.entrySet().stream().collect(Collectors.groupingBy(e -> e.getValue())));
		
		System.out.println(result);
		
		//Print count of all the characters using Java 8 features
		String s = "google";
		
		System.out.println(s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting())));
		
		Map<Object, Long> myMap = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting())).forEach((character, frequency) -> System.out.println(character + ": " + frequency));
		
		
		String h = "happy";
		
		System.out.println(h.chars().mapToObj(c -> (char)c).filter(c -> c == 'p').collect(Collectors.groupingBy(c -> c, Collectors.counting())));
		
		
		
		
		
	}

}
