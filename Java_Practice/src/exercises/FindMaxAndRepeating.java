package exercises;
import java.util.HashMap;
import java.util.Map;

public class FindMaxAndRepeating {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,4,5,6};

		Map<Integer, Boolean> map = new HashMap<>();
		
		for(Integer a:arr)
		{
			
			if (map.get(a) == null) {
				map.put(a, true);
			} else {
				System.out.println("Repeating: " + a);
			}
		}
		
		for(int i=1; i<=arr.length; i++)
		{
			if (map.get(i) == null) {
				System.out.println("Missing: " + i);
			}
			
		}
		
		
		
	}

}
