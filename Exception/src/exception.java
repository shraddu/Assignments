import java.util.Scanner;
public class exception {

	public static void main(String[] args) {
		 int a,b;
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter Dividend :");
		a = sc.nextInt();
		System.out.println("Enter Divisor :");
		b = sc.nextInt();
		
		
		
		try {
			System.out.print("result:"+ (a/b));
		} catch (ArithmeticException e) {
			 System.out.println("End of Program");
		}
		
		
		
	}

}
