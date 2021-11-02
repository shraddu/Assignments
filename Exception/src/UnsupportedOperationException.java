import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class UnsupportedOperationException {


	public static void main(String[] args) {
		
		String str[] = { "Sun", "Mon" };
		List<String> list = Arrays.asList(str);
	
		List<String> l = new ArrayList<>(list);
		

		l.add("Tue"); 

		for(String s: l )
		System.out.println(s);
		System.out.println("Unsupported Operation Exception Handled here");

	}
	
}