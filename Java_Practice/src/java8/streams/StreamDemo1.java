package java8.streams;
//Java program to get slice of a stream using 
//Collection skip() and limit() 
import java.util.*; 
import java.util.stream.*; 

class StreamDemo1 { 

	// Generic function to get Slice of a 
	// Stream from startIndex to endIndex 
	public static <T> Stream<T> 
	getSliceOfStream(Stream<T> stream, int startIndex, int endIndex) 
	{ 
		return stream.collect(Collectors.collectingAndThen( 

			// 1st argument 
			// Convert the stream to list 
			Collectors.toList(), 

			// 2nd argument 
			list -> list.stream() 
						// specify the number of elements to skip 
						.skip(startIndex) 

						// specify the no. of elements the stream 
						// that should be limited 
						.limit(endIndex - startIndex + 1))); 
	}
	
	// Method 1
    // To flatten a map containing a list of items as values
    public static <T> Stream<T>
    flatten(Collection<List<T> > values)
    {

        // Stream.flatMap() method converts
        // Stream<Collection<T>> to the  Stream<T>
        Stream<T> stream
            = values.stream().flatMap(x -> x.stream());

        // Return the desired stream
        return stream;
    }
	
	public static void main(String[] args) 
	{ 

		// Create a new List with values 11 - 20 
		List<Integer> list = new ArrayList<>(); 
		for (int i = 1; i <= 20; i++) 
			list.add(i); 

		// Create stream from list 
		Stream<Integer> intStream = list.stream(); 

		// Print the stream 
		System.out.println("List: " + list); 

		// Get Slice of Stream 
		// containing of elements from the 4th index to 8th 
		Stream<Integer> 
			sliceOfIntStream = getSliceOfStream(intStream, 5, 8); 

		// Print the slice 
		System.out.println("\nSlice of Stream:"); 
		sliceOfIntStream.forEach(System.out::println); 
		
		
		
		// Creating an object of Map class
        // Declaring object of integer and string type
        Map<Integer, List<String> > map = new HashMap<>();

        // Adding elements to the above Map object
        // Custom input entries
        map.put(1, Arrays.asList("1", "2", "3"));
        map.put(2, Arrays.asList("4", "5", "6"));

        // Creating a List class object holding all elements
        // after flattening
        List<String> s = flatten(map.values())
                             .collect(Collectors.toList());

        // Print and display the above List object
        System.out.println(s);
		
		
	} 
} 
