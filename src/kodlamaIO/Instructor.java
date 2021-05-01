package kodlamaIO;

public class Instructor extends User {

	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String userName, String password) {
		this();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setUserName(userName);
		this.setPassword(password);
	}
}
