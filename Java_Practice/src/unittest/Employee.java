package unittest;

public class Employee {
      private String name;
	  private Integer salary;
	  private Address address;
	  public Employee(String name, String aSalary, Address address){
		  this.name = name;
	    this.salary = new Integer(aSalary);
	    this.address = address;
	  }
	  public Integer getSalary(){
	    return this.salary;
	  }
	  
	  public Address getAddress() {
		  return this.address;		  
	  }
	  
	  public String toString() {
			return name + " " + salary + " " + address;
		}
	  
}

