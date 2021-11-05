import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
public class Problem1 {

	public static void main(String[] args) {
		TreeMap<Long,Contact> t = new TreeMap<>();
		t.put(8698490198L,(new Contact("Shraddha", "sv041299@gmail.com", "Female")));
		t.put(88677944670L,(new Contact("Devyani", "devyani99@gmail.com", "Female")));
		System.out.println(t);
		Set<Map.Entry<Long,Contact>> entrySet = t.entrySet();
		System.out.println(entrySet);
		
		System.out.println("Key of Tree Map are ");
		for(Map.Entry<Long, Contact>entryArray:entrySet) {
			System.out.println(entryArray.getKey());
		}
		System.out.println("Value of Tree Map are ");
		for(Map.Entry<Long, Contact>entryArray:entrySet) {
			System.out.println(entryArray.getValue());
		}
		

	}

}
