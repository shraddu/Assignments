import java.util.HashSet;
import java.util.Iterator;

public class Que1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(127,"Shraddha","Analyst",50000L);
		Employee e2 = new Employee(125,"Papiya","SDE",60000L);
		
		HashSet<Employee> hash = new HashSet<>();
		hash.add(e1);
		hash.add(e2);
		
		
		Iterator<Employee> iterate = hash.iterator() ;
		while (iterate.hasNext()) {
			iterate.next().display();
			System.out.println();
			
		}
	}

}

class Employee {
	int id ;
	String Name,Dept;
	long Salary;
	public Employee(int id, String name, String dept, long salary) {
		super();
		this.id = id;
		this.Name = name;
		this.Dept = dept;
		this.Salary = salary;
	}
      public void display() {
    	    System.out.println("ID : " + id);
			System.out.println("Name : "+ Name );
			System.out.println("Salary : " + Salary);
			System.out.println("Department : " + Dept);
			
      }
}