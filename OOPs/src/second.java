class Employee
	{
	     String name;
	     int salary;
	     Employee()
	     {
	          name = null;
	          salary = 0;
	     }
	     Employee (String name, int salary)
	     {
	          this.name = name;
	          this.salary = salary;
	     }
	     double getSalary()
	     {
	          return salary;
	     }
	}
 
	class Manager extends Employee
	{
	     int hra, ta, incentive;
	     Manager()
	     {
	          super();
	          hra = ta = incentive= 0;
	     }
	     Manager(String n, int sal, int h, int t, int incen)
	     {
	          super(n, sal);
	          hra = h;
	          ta = t;
	          incentive= incen;
	     }
	     double getSalary()
	     {
	          return (super.getSalary()+hra+ta+incentive);
	     }
	}
	
	class Labour extends Employee
	{
	     int hra, ta;
	     Labour()
	     {
	          super();
	          hra = ta = 0;
	     }
	     Labour(String n, int sal, int h, int t)
	     {
	          super(n, sal);
	          hra = h;
	          ta = t;
	     }
	     double getSalary()
	     {
	          return (super.getSalary()+hra+ta);
	     }
	}

public class second{

	public static void main(String[] args) {
		
	          Manager m = new Manager("shraddha",25000,500,1500,1000);
	          System.out.println("Salary of Manager:"+m.getSalary());
	          Labour l = new Labour("kalia",10000,200,500);
	          System.out.println("Salary of Labour: "+l.getSalary());
	     }

	}
