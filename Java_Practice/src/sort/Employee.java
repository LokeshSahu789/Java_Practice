package sort;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private String name;
	private int age;

	public Employee() {}
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return o.name.compareTo(this.name);
	}

}

class AgeSort implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getAge() < o2.getAge())
            return -1;
        if (o1.getAge() > o2.getAge())
            return 1;
        else
            return 0;
	}
	
}

class NameSort implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
