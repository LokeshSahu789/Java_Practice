package collections;
import java.util.HashMap;
import java.util.Map;

import oops.Employee;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee("test", 25, null);
		Map<Employee,Boolean> map = new HashMap<>();
		map.put(emp,true);
		
		emp.setAge(12);
		emp.setName("test123");
		
		System.out.println(map.get(emp));// What is output of it
		
		
		HashMap<Employee,String> employeeMap = new HashMap<Employee,String>();  
	    Employee employee1 = new Employee();   
	    employee1.setAge(1);   
	    employee1.setName("Sachin");   
	    employee1.setAddresses(null);;   
	 
	    // Step 1
	    employeeMap.put(employee1,"India");   

	    for (Map.Entry<Employee, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());   
	    }
	    // Step 2
	    // Mutating the Employee Object
	    employee1.setName("Rahul");    

	    for (Map.Entry<Employee, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());    
	    }
	    // The HashMap key is mutated and in the wrong bucket for that hashcode. 
	    // Step 3
	    System.out.println(employeeMap.get(employee1));    
	    // Returns null    

	    Employee employee2 = new Employee();   
	    employee2.setAge(12);   
	    employee2.setName("Anuj");   
	    employee2.setAddresses(null);
	    
	    employeeMap.put(employee2,"Bhutan");
	    
	    employee2.setName("Changed");
	    
	    System.out.println(employeeMap.get(employee2)); 
		
		
	}

}
