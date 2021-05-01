package kodlamaIO;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" eklendi");
	}
	
	public void update(int id) {
		System.out.println("E�itmen g�ncellendi.");
	}
	
	public void delete(int id) {
		System.out.println("E�itmen silindi.");
	}
	
	public void getAll(Instructor[] instructors) {
		for(Instructor instructor:instructors) {
			System.out.println(instructor.getFirstName());
		}
	}
}
