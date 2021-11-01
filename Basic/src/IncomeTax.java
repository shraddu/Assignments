public class IncomeTax {

	public static void main(String[] args) {
		double n = 200000;
		double tax = 0;
		 if(n<=180000)
	        {
	        tax=0;
	        }
	        else 
	        if(n>180000 && n<=300000)
	        {
	        tax=n*(0.1);
	        }
	        else
	        if(n>300000 && n<=500000)
	        {
	        tax=n*(0.2);
	        }
	        else if(n>500000 && n<=1000000)
	        {
	        tax=n*(0.3);
	        }
	        System.out.print(tax);
	}

}