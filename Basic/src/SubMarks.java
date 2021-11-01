import java.util.Scanner;
public class SubMarks {

	public static void main(String[] args) {
		Float number , s1,s2,s3,s4,s5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subject 1 marks :");
		s1= sc.nextFloat();
		System.out.println("Enter subject 2 marks :");
		s2= sc.nextFloat();
		System.out.println("Enter subject 3 marks :");
		s3= sc.nextFloat();
		System.out.println("Enter subject 4 marks :");
		s4= sc.nextFloat();
		System.out.println("Enter subject 5 marks :");
		s5= sc.nextFloat();
		sc.close();
		
		if (s1>60 && s2>60 && s3>60 && s4>60 && s5>60)
		{
			System.out.println("You are passed");
			
		}else if (
				 (s1>60) || (s2>60) && (s3>60) && (s4>60) && (s5>60)
				&& (s1>60) && (s2>60) || (s3>60) && (s4>60) && (s5>60)
				&& (s1>60) && (s2>60) && (s3>60) || (s4>60) && (s5>60)
				&& (s1>60) && (s2>60) && (s3>60) && (s4>60) || (s5>60)
				)
				
		{
			System.out.println("You are promoted");
		}
		else
		{
			System.out.println("You are failed");	
	    }

	}

		

	}

