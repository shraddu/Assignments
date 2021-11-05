import java.util.*;
public class Employee {
	private int Id;
	private String Name;
	private String Department;
	private int Salary;
	
	public Employee(int Id, String Name, String Department, int Salary) {
		super();
		this.Id = Id;
		this.Name = Name;
		this.Department = Department;
		this.Salary = Salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public String toString() {
		return " "+this.Id+" "+this.Name+" "+this.Department+" "+this.Salary;
	}
}
 class IdCompare implements Comparator<Employee>{
	 
	 @Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId()>o2.getId()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
 class NameCompare implements Comparator<Employee>{
	 
	 @Override
	 public int compare(Employee o1, Employee o2) {
		 return o1.getName().compareTo(o2.getName());
	 }
	 
 }
 class DepartmentCompare implements Comparator<Employee>{
	 
	 @Override
	 public int compare(Employee o1, Employee o2 ) {
		 return o1.getDepartment().compareTo(o2.getDepartment());
	 }
 }
class SalaryCompare implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()>o2.getSalary()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}