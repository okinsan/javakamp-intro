package kodlamaIO;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" eklendi");
	}
	
	public void update(int id) {
		System.out.println("Eðitmen güncellendi.");
	}
	
	public void delete(int id) {
		System.out.println("Eðitmen silindi.");
	}
	
	public void getAll(Instructor[] instructors) {
		for(Instructor instructor:instructors) {
			System.out.println(instructor.getFirstName());
		}
	}
}
