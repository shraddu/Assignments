public class Que4 {

	public static void main(String[] args) {
		Pair <String, String> obj1 = new Pair<>("1", "Hello");
		Pair <String, java.util.Date> obj2 = new Pair <>("Today's date is:" , new java.util.Date());
		
		System.out.println(obj1.showData());
		System.out.println(obj2.showData());
		

	}

}


class Pair<K,V>{
	private K Key;
	private V Value;
	public Pair(K key, V value) {
		super();
		Key = key;
		Value = value;
	}
	
	@SuppressWarnings("hiding")
	public <K,V> String  showData(){
		return Key +" "+Value;
		
		
	}
	
	
}