package exercises;
import java.util.HashMap;
import java.util.Map;

public class PrintPair {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 5, 5, 7, 7, 7, 7, 7, 8, 9, 11, 12 };
		int n = arr.length;
		int sum = 14;
		printPairs(arr, n, sum);

	}

	static void printPairs(int[] arr, int n, int sum) {
		// Store count of all elements in map
		Map<Integer, Integer> map = new HashMap<>();

		// Traverse through all elements
		for (int i = 0; i < arr.length; i++) {
			// Search if a pair can be formed using a[i]
			int rem = sum - arr[i];

			if (rem == arr[i]) {
				// Check if the compliment is in the map and occurs only one
				if (map.containsKey(rem) && map.get(rem) == 1)
					System.out.println("(" + rem + ", " + arr[i] + ")");
			} else if (map.containsKey(rem) && !map.containsKey(arr[i])) {
				System.out.println("(" + rem + ", " + arr[i] + ")");
			}

			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			System.out.println("Iteration: " + i + " and map: " + map);
		}

	}

}
