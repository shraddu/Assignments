class A
{
	static A obj = new A();
	private A()
	{
		System.out.println("Shraddha");
	}
	public static A getInstance()
	{
		return obj;
	}

}

public class singletone {

	public static void main(String[] args) {
	
		A obj1 = A.getInstance();
		A obj2 = A.getInstance();
	}

}

