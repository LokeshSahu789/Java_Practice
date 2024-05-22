package strings;

public class Student {

	public int id;
	public String name;

	public static void main(String[] args) {
		 Student s1 = new Student();
		 s1.id=1;
		 s1.name="Lazy Programmer";
		 
		 Student s2 = new Student();
		 s2.id=1;
		 s2.name="Lazy Programmer";
		 
		 System.out.println(s1);
		 System.out.println(s2);
		 
		 System.out.println((s1==s2)+":"+(s1.equals(s2)));
	}	
}
