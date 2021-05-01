package kodlamaIO;

public class Student extends User {
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String userName, String password) {
		this();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setUserName(userName);
		this.setPassword(password);
	}
}
