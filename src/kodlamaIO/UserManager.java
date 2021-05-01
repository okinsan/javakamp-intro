package kodlamaIO;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " eklendi.");
	}
	
	public void update(int id) {
		System.out.println("Kullan�c� g�ncellendi.");
	}
	
	public void delete(int id) {
		System.out.println("Kullan�c� silindi.");
	}
	
	public void getAll(User[] users) {
		for(User user:users) {
			System.out.println(user.getFirstName());
		}
	}
}
