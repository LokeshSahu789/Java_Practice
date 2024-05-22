package java8.streams;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestTechM{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hashmap = new HashMap<>();
		
		hashmap.put(1, "Lokesh");
		hashmap.put(2, "Test");
		hashmap.put(4, "Avi");
		hashmap.put(3, "Manish");
		
		//Sort the map based upon value
		//Display the sorted value with both key and value
		
		LinkedHashMap<Integer, String> sortedMap = hashmap.entrySet().stream().sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		//System.out.println(hashmap.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue())
		//					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println(hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)));
		
		System.out.println(sortedMap);
		
		hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		//Collectors.toMap(null, null)
		
		
		
		
		
	}

	
}



