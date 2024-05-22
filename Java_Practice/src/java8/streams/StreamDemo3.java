package java8.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import unittest.Address;
import unittest.Employee;

public class StreamDemo3 {

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "world";
		String result = str1 + str2;
		
		//System.out.println(result == "helloworld");
		
		//find square of list, then filter greater than 100 and then find average of numbers
			
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		double average = list.stream().map(x -> x*x).filter(x -> x>10).mapToDouble(Integer::doubleValue).average().orElse(0.0);
		
		System.out.println(average);
		
		//square of list, then filter greater than 100 and then find sum of numbers
		
		Integer sum = list.stream().map(x -> x*x).filter(x -> x>10).reduce(0, (a,b) -> a+b );
		
		System.out.println(sum);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Emp1", "1", new Address("street1", "lane1", 123)));
		empList.add(new Employee("Emp2", "2", new Address("street2", "lane2", 124)));
		empList.add(new Employee("Emp3", "3", new Address("street3", "lane3", 125)));
		
		//From a list of employees, find employees with highest salary
		
		Integer highest = empList.stream().map(Employee::getSalary).reduce(0, (Integer a, Integer b) -> Integer.max(a, b));
		
		System.out.println(highest);
		
		//From a list of employees, find employees with lowest salary
		
		Integer lowest = empList.stream().map(Employee::getSalary).reduce(0, (Integer a, Integer b) -> Integer.min(a, b));
			
		System.out.println(lowest);
		
		//From a list of employees, find sum of all the salaries
		
		Integer total = empList.stream().map(Employee::getSalary).reduce(0, (Integer a, Integer b) -> Integer.sum(a, b));
					
		System.out.println(total);
		
		//From a list of employees, find employees with a street as address
		
		List<Address> listOfStreet = empList.stream().map(Employee::getAddress).filter(x -> x.getStreet().equals("street1")).collect(Collectors.toList());
		
		System.out.println(listOfStreet);
		
		//From a list of employees, find employees with a street as address
		
		List<Employee> listOfEmp = empList.stream().filter(x -> x.getAddress().getStreet().contains("street")).collect(Collectors.toList());
				
		System.out.println(listOfEmp);
		
		//Find sum of keys and values in Map
		
		Map<Integer, Integer> map = new ConcurrentHashMap<>();
		map.put(1, 2);
		map.put(2, 3);
		map.put(3, 4);
		map.put(4, 5);
		
		Integer keySum = map.keySet().stream().reduce(0, (Integer a, Integer b) -> Integer.sum(a, b));
		Integer valuesSum = map.values().stream().reduce(0, (Integer a, Integer b) -> Integer.sum(a, b));
		
		System.out.println(keySum + " " + valuesSum);
		
		
		//From a list of employees, find employees with a street as part of address and return set
		
		Set<Employee> setOfEmp = empList.stream().filter(x -> x.getAddress().getStreet().contains("street")).collect(Collectors.toSet());
					
		System.out.println(setOfEmp);
		
		//From a list of employees, find employees with a street as part of address and return set
		
		//Set<Employee> setOfEmp = empList.stream().filter(x -> x.getAddress().getStreet().contains("street")).collect(Collectors.toSet());
					
		//System.out.println(setOfEmp);
		
		//--------------------------------------------
		
		
	}

}

