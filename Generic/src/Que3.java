public class Que3 {

	public static void main(String[] args) {
		Integer arr []= {10,15};
		
		System.out.println("Before Exchange:" + arr[0]+" "+ arr[1]);
		System.out.println("After Exchange:");
		exchangeArrNum(arr);
		

	}
	public static <E> void exchangeArrNum(E[] arr) {
		E temp = arr [1];
		arr[1]= arr[0];
		arr[0]=  temp;
		
		System.out.println( arr[0]+" "+ arr[1]);
		
	}

}