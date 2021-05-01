package kodlamaIO;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName()+ " eklendi.");
	}
	
	public void update(int id) {
		System.out.println("��renci g�ncellendi.");
	}
	
	public void delete(int id) {
		System.out.println("��renci silindi.");
	}
	
	public void getAll(Student[] students) {
		for(Student student:students) {
			System.out.println(student.getFirstName());
		}
	}
}
