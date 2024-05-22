package java8.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void filterByCustomProperties() 
    { 
        // create a string array 
        String[] myArray 
            = new String[] { "madam", "please", "refer", 
                             "link",  "on",     "racecar" }; 
  
        // filter using a custom method 
        Stream.of(myArray) 
            .filter(x -> palindrome(x)) 
            .forEach(System.out::println); 
    } 
  
      // checks if palindrome or not 
    public static boolean palindrome(String s) 
    { 
        if (s.length() <= 1) 
            return true; 
        else
            return (s.charAt(0) == s.charAt(s.length() - 1)) 
                && palindrome( 
                       s.substring(1, s.length() - 1)); 
    } 
	
	public static void main(String[] args) {
		
		// Creating an ArrayList object of integer type 
        ArrayList<Integer> al = new ArrayList<Integer>(); 
  
        // Inserting elements to ArrayList class object 
        // Custom input integer numbers 
        al.add(2); 
        al.add(6); 
        al.add(9); 
        al.add(4); 
        al.add(20); 
  
        // First lets print the collection 
        System.out.println("Printing the collection : "
                           + al); 
  
        // Printing new line for better output readability 
        System.out.println(); 
        
        List<Integer> newList = al.stream().filter(n -> n % 2 == 0).map(m-> m*10).sorted((a, b) -> a<b ? 1 : a>b ? -1 :0).collect(Collectors.toList());
        
        // First lets print the collection 
        System.out.println("Printing the collection after streams : "
                           + newList); 
  
        // Printing new line for better output readability 
        System.out.println(); 
        
        
        // create a stream of strings 
        Stream<String> myStream 
            = Stream.of("Like", "and", "Share", "https://www.geeksforgeeks.org/"); 
  
        // only string starting with "http://" will be 
        // considered for next API(forEach) 
        myStream.filter(x -> x.startsWith("https://")).forEach(System.out::println); 
        
        filterByCustomProperties();
        
        
        // create a list 
        List<String> list = Arrays.asList("Hello ",  
                         "G", "E", "E", "K", "S!"); 
  
        // using parallelStream()  
        // method for parallel stream 
        list.parallelStream().forEach(System.out::print);
        
        // Printing new line for better output readability 
        System.out.println(); 
        
        list.stream().forEach(System.out::print);
        
        // Printing new line for better output readability 
        System.out.println(); 
        
        // using parallelStream() method for parallel stream 
        list.parallelStream().forEachOrdered(System.out::print);
        
		
	}
	
}
