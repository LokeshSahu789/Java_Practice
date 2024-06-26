package oops;
import java.util.List;

public class Employee {
	private String name;
	private int age;
	private List<Address> addresses;

	public Employee() {}
	
	public Employee(String name, int age, List<Address> addresses) {
		super();
		this.name = name;
		this.age = age;
		this.addresses = addresses;
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

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", addresses=" + addresses + "]";
	}

}
