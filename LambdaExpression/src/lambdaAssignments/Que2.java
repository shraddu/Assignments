package lambdaAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Orders{  
    
    String status;  
    float price;  
    public Orders( String status, float price) {  
      //  super();  
       
        this.status = status;  
      this.price = price;  
    }                                                               
}  



public class Que2 {

	
	public static void main(String[] args) {  
        List<Orders> list=new ArrayList<Orders>();  
        list.add(new Orders("Order Status:Accepted",25000f));  
        list.add(new Orders("Order Status:Completed",6000f));  
        list.add(new Orders("Order Status:Accepted",1200f));  
        list.add(new Orders("Order Status:Completed",2500f));  
        
        // using lambda to filter data  
        Stream<Orders> filtered_data = list.stream().filter(p -> p.price > 10000 && p.status.startsWith("Order Status:Accepted") || p.status.startsWith("Order Status:Completed"));
   		
        // we will use lambda to iterate through collection  
        filtered_data.forEach(Orders -> System.out.println("Order Price is "+Orders.price+ " & "+Orders.status));  
    }  
}  

