package sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestImmutable {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("street 1", "city X");
		List<String> phoneNumbers = new ArrayList<>();
		phoneNumbers.add("123456");
		phoneNumbers.add("456789");
		Map<String, String> metadata = new HashMap<>();
		metadata.put("hobby", "Watching Movies");

		// Declare the employee
		ImmutableEmployee e = new ImmutableEmployee("John", 23, address, phoneNumbers, metadata);

		// Update details
		e.getPhoneNumbers().add("345123");
		e.getMetadata().put("skill", "Java");
		e.getMetadata().put("designation", "HR");

		// change address details
		e.getAddress().setCity("c3");
		e.getAddress().setStreet("s3");

		System.out.println(e.getPhoneNumbers());
		System.out.println(e.getMetadata());
		System.out.println(e.getAddress());
		
		//Consumer<T>
		//Predicate<T>
		//Function<T, R>
		//Supplier<T>
		//BiPredicate<T, U>

	}

}
