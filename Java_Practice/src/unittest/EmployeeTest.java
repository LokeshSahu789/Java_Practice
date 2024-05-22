package unittest;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class EmployeeTest {

	@Test
	public void testReduceWithImmutable(){
	  List<Employee> list = new LinkedList<>();
	  list.add(new Employee("Emp1", "1", new Address("street1", "lane1", 123)));
	  list.add(new Employee("Emp2", "2", new Address("street2", "lane2", 124)));
	  list.add(new Employee("Emp3", "3", new Address("street3", "lane3", 125)));

	  Integer sum = list
	  .stream()
	  .map(Employee::getSalary)
	  .reduce(0, (Integer a, Integer b) -> Integer.sum(a, b));

	  assertEquals(Integer.valueOf(6), sum);
	  
	  
	  
	}
	
}
