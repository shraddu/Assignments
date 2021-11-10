package io.assignment;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Customer customer2 = (Customer)context.getBean("c");
		
		 
		Customer obj = new Customer(1, "Shraddha", "8698490189",new Address("1", "Bhandara", "MH", 441906, "India"));
		
		
		if (customer2.getCustomerName().equals(obj.getCustomerName())) {
			System.out.println("Success");
		} else {
			fail("Not yet implemented");
		}
	}

}