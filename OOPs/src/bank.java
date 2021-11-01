public class bank{
	
	public static void main(String[] args)   
	{  
	  saving obj=new saving();
	  obj.totalCash();
	  current obj1=new current();
	  obj1.totalCash();
	}
}
	class saving
	{
	  public void totalCash()
	  {
	     System.out.println(100000); 
	  }
	}
	class current
	{
	   public void totalCash()
	   {
	        System.out.print(200000);
	   }
	}