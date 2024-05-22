package java8.streams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import oops.Address;
import oops.Employee;

public class StreamDemo4 {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		List<Address> add1 = new ArrayList<Address>();
		//new ArrayList<Address>(Arrays.asList(new Address("New York"), new Address("New York")));
		add1.add(new Address("New York"));
		add1.add(new Address("London"));
		add1.add(new Address("Delhi"));
		
		List<Address> add2 = new ArrayList<Address>();
		//new ArrayList<Address>({new Address("New York"), new Address("New York")})
		add2.add(new Address("New York"));
		add2.add(new Address("London"));
		add2.add(new Address("Delhi"));
		
		List<Address> add3 = new ArrayList<Address>();
		//new ArrayList<Address>({new Address("New York"), new Address("New York")})
		add3.add(new Address("New York"));
		add3.add(new Address("Mumbai"));
		add3.add(new Address("Delhi"));
		
		employees.add(new Employee("Alice", 25, add1));
		employees.add(new Employee("Altas", 15, add2));
		employees.add(new Employee("Anderson", 30, add3));
		
		
		//employees.stream().filter(e -> e.getAge() >= 18).flatMap(l -> l.stream()).forEach(s -> System.out.println(s));
		//employees.stream().filter(e -> e.getAge() >= 18).flatMap(l -> l.getAddresses().stream()).distinct().forEach(s -> System.out.println(s.getCity()));
		employees.stream().filter(e -> e.getAge() >= 18).flatMap(l -> l.getAddresses().stream()).map(a -> a.getCity()).distinct().forEach(s -> System.out.println(s));
		
		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting())));
		
		employees.stream().mapToInt(Employee::getAge).max().ifPresent(s -> System.out.println(s));
		
		employees.stream().max(Comparator.comparingInt(Employee::getAge)).ifPresent(s -> System.out.println(s));
		
		employees.stream().forEach(System.out::println);
		
		
	}

}
