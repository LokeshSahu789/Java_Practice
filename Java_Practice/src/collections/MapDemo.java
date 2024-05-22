package collections;
// Java program to illustrate HashMap class 
// of java.util package
 
// Importing HashMap class
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
 
// Main class
public class MapDemo {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();
 
        // Adding elements to the Map
        // using standard put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
 
        // Print size and content of the Map
        System.out.println("Size of map is:- " + map.size());
        
     // Iterate the map using
        // for-each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
        
        map.forEach((key, value) -> System.out.println(key + " = " + value));
        
        Iterator<Map.Entry<String, Integer>> map_iterator = map.entrySet().iterator();
        
        while(map_iterator.hasNext())
        {
        	Map.Entry<String, Integer> set = (Map.Entry<String, Integer>) map_iterator.next();
        	System.out.println("Key 1: " + set.getKey() + " Value 1: " + set.getValue());
        }
 
        map.entrySet().stream().forEach(input -> System.out.println(input.getKey() + " : " + input.getValue()));
        
        // Printing elements in object of Map
        System.out.println(map);
 
        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("vishal")) {
 
            // Mapping
            Integer a = map.get("vishal");
 
            // Printing value for the corresponding key
            System.out.println("value for key"
                               + " \"vishal\" is:- " + a);
        }
    }
}