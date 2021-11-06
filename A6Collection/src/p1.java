import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class p1 {

	public static void main(String[] arg) {
		
		TreeMap<Long,Contact> tree=new TreeMap<>();
		tree.put(8698491098L,(new Contact("Shraddha", "sv041299@gmail.com", "Female")));
		tree.put(7777745638L,(new Contact("Sayali","sayali123@gmail.com","Female")));
		tree.put(9529846727L,(new Contact("Devyani","devyani23@gmail.com","Female")));
		tree.put(8698433208L,(new Contact("Papiya","papiya27@gmail.com"," Female")));
		tree.put(6548789830L,(new Contact("Shushmita","sush19199@gmail.com","Female")));
		tree.put(8888851518L,(new Contact("Nikhil","nikhil9199@gmail.com","Male")));
		tree.put(7447747739L,(new Contact("Aditya","adi9199@gmail.com","Male")));
		tree.put(9850394030L,(new Contact("Anil","anil24@gmail.com","Male")));
		tree.put(8551755885L,(new Contact("Eliza","eli2808@gmail.com","Female")));
		tree.put(6538789830L,(new Contact("Sonu","sonu19199@gmail.com","Female")));
		System.out.println(tree);
		Set<Map.Entry<Long,Contact>> entrySet=tree.entrySet();
		System.out.println(entrySet);
		System.out.println("Key of Tree Map are :\n");
		for(Map.Entry<Long, Contact> entryArray:entrySet) {
			System.out.println(entryArray.getKey());
		}
		System.out.println("Values of Tree Map are :\n");
		for(Map.Entry<Long, Contact> entryArray:entrySet) {
			System.out.println(entryArray.getValue());
		}

	}

}