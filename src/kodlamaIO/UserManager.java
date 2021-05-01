package kodlamaIO;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " eklendi.");
	}
	
	public void update(int id) {
		System.out.println("Kullanýcý güncellendi.");
	}
	
	public void delete(int id) {
		System.out.println("Kullanýcý silindi.");
	}
	
	public void getAll(User[] users) {
		for(User user:users) {
			System.out.println(user.getFirstName());
		}
	}
}
