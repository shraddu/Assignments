public class six {

	public static void main(String[] args) {
		
		FilePersistance fp = new FilePersistance();
		DataBasePersistance dp = new DataBasePersistance();
		fp.persist();
		dp.persist();
		
		

	}
}
    abstract class Persistance {
	public abstract void persist();
}
    class FilePersistance extends Persistance {
	public void persist() {
		System.out.println("This file will saved FilePersistance");
		
		
	}
}
    class DataBasePersistance extends Persistance {
	public void persist() {
		System.out.println("This file will saved DataBasePersistance");

		
		
	}
	
}
