
public class Contact {
	private String name;
	private String Email;
	private String Gender;
	
	public Contact( String name, String Email, String Gender) {
		super();
		this.name = name;
		this.Email = Email;
		this.Gender = Gender;
	}


	public String getName() {
		return name;
	}

	public String getEmail() {
		return Email;
	}

	public String getGender() {
		return Gender;
	}
	
	public String toString() {
		return " "+this.name+" "+this.Email+" "+this.Gender;
	}
	
}



