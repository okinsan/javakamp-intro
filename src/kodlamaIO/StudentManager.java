package kodlamaIO;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName()+ " eklendi.");
	}
	
	public void update(int id) {
		System.out.println("Öðrenci güncellendi.");
	}
	
	public void delete(int id) {
		System.out.println("Öðrenci silindi.");
	}
	
	public void getAll(Student[] students) {
		for(Student student:students) {
			System.out.println(student.getFirstName());
		}
	}
}
