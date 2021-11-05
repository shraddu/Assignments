import java.util.Scanner;
import java.util.TreeSet;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=4; i++) {
			System.out.println("1:Id\n 2:Name\n 3:Department\n 4:Salary");
			System.out.println("Enter your choice:");
			int n = sc.nextInt();
			
			switch(n) {
			case 1:
				TreeSet<Employee> t = new TreeSet<>(new IdCompare());
				t.add(new Employee(01, "Shraddha", "Analyst A4", 20000));
				t.add(new Employee(02, "Devyani", "ASE", 25000));
				t.add(new Employee(03, "Sayali", "Analyst", 28000));
				t.add(new Employee(22, "Aditya", "SAP", 21000));
				t.add(new Employee(11, "Papiya", "SD", 22000));
				t.add(new Employee(34, "Rohit", "ASE", 25000));
				t.add(new Employee(54, "Sushmita", "SAP", 23000));
				t.add(new Employee(53, "Amit", "SD", 20000));
				t.add(new Employee(21, "Aniket", "Data Analyst", 20000));
				t.add(new Employee(65, "Anil", "Analyst A4", 20000));
				
				for(Employee E:t) {
					System.out.println(E);
				}
				break;
				
			case 2:
				TreeSet<Employee> t1 = new TreeSet<>(new NameCompare());
				t1.add(new Employee(01, "Shraddha", "Analyst A4", 20000));
				t1.add(new Employee(02, "Devyani", "ASE", 25000));
				t1.add(new Employee(03, "Sayali", "Analyst", 28000));
				t1.add(new Employee(22, "Aditya", "SAP", 21000));
				t1.add(new Employee(11, "Papiya", "SD", 22000));
				t1.add(new Employee(34, "Rohit", "ASE", 25000));
				t1.add(new Employee(54, "Sushmita", "SAP", 23000));
				t1.add(new Employee(53, "Amit", "SD", 20000));
				t1.add(new Employee(21, "Aniket", "Data Analyst", 20000));
				t1.add(new Employee(65, "Anil", "Analyst A4", 20000));
				
				for(Employee E:t1) {
					System.out.println(E);
				}
				break;
			case 3:
				TreeSet<Employee> t2 = new TreeSet<>(new DepartmentCompare());
				t2.add(new Employee(01, "Shraddha", "Analyst A4", 20000));
				t2.add(new Employee(02, "Devyani", "ASE", 25000));
				t2.add(new Employee(03, "Sayali", "Analyst", 28000));
				t2.add(new Employee(22, "Aditya", "SAP", 21000));
				t2.add(new Employee(11, "Papiya", "SD", 22000));
				t2.add(new Employee(34, "Rohit", "ASE", 25000));
				t2.add(new Employee(54, "Sushmita", "SAP", 23000));
				t2.add(new Employee(53, "Amit", "SD", 20000));
				t2.add(new Employee(21, "Aniket", "Data Analyst", 20000));
				t2.add(new Employee(65, "Anil", "Analyst A4", 20000));
				
				for(Employee E:t2) {
					System.out.println(E);
				}
				break;
			case 4:
				TreeSet<Employee> t3 = new TreeSet<>(new SalaryCompare());
				t3.add(new Employee(01, "Shraddha", "Analyst A4", 20000));
				t3.add(new Employee(02, "Devyani", "ASE", 25000));
				t3.add(new Employee(03, "Sayali", "Analyst", 28000));
				t3.add(new Employee(22, "Aditya", "SAP", 21000));
				t3.add(new Employee(11, "Papiya", "SD", 22000));
				t3.add(new Employee(34, "Rohit", "ASE", 25000));
				t3.add(new Employee(54, "Sushmita", "SAP", 23000));
				t3.add(new Employee(53, "Amit", "SD", 20000));
				t3.add(new Employee(21, "Aniket", "Data Analyst", 20000));
				t3.add(new Employee(65, "Anil", "Analyst A4", 20000));
				
				for(Employee E:t3) {
					System.out.println(E);
				}
				break;
			}
		}
	}

}
