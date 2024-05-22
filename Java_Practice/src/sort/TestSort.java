package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestSort {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Lokesh1", 20));
		list.add(new Employee("Lokesh2", 60));
		list.add(new Employee("Lokesh3", 40));
		list.add(new Employee("Lokesh4", 50));
		
		System.out.println("Using default comparable");
		
		//First, sort using the comparable interface
		Collections.sort(list);
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		//Then, we will use the comparator interface
		
		System.out.println("Using Age comparator");
		
		Collections.sort(list, new AgeSort());
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		//Then, we will use the comparator interface
		
		System.out.println("Using Name comparator");
		
		Collections.sort(list, new NameSort());
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println("Using Stream comparator");
		
		list.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.groupingBy(Employee::getAge, Collectors.counting())).entrySet().stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
		
		list.stream().sorted(Comparator.comparing(Employee::getAge)).forEach((e) -> System.out.println(e));
		
		List<Employee> sortedByAge = list.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
		
		sortedByAge.forEach((s) -> System.out.println(s));
		
		//Modifying the original list
		
		sortedByAge.forEach((s) -> s.setAge(s.getAge() + 5));
		
		sortedByAge.forEach((s) -> System.out.println(s));
		
	}

}
