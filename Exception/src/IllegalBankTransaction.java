import java.util.Scanner;

public class IllegalBankTransaction {
	
	static void fun() throws IllegalAccessException 
    { 
        double balance = 1000,  wamount;
        
        Scanner wd=new Scanner(System.in);
        System.out.print("Withdraw an amount:");

        wamount=wd.nextInt();
        
        balance -= wamount;
        wd.close();


        if (wamount<0)
        {
        throw new IllegalAccessException(); 
        }
        else if (balance<0)
        {
        	System.out.println("Insufficient Balance");
        }
        else {
        	System.out.println("Your reamining balance is:"+balance);
        	
        }
        
        }



    public static void main(String args[]) 
    { 

        try
        { 
            fun(); 
        } 
        catch(IllegalAccessException ex) 
        { 
            System.out.println("IllegalBankTransaction"); 
        } 
    } 
} 