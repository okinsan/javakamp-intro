package kodlamaIO;

public class CourseManager {
	public void add(Course course) {
		System.out.println("Kurs eklendi: "+course.getName());
	}
	
	public void update(Course course) {
		System.out.println("Kurs güncellendi: "+course.getName());
	}
	
	public void delete(Course course) {
		System.out.println("Kurs silindi: "+course.getName());
	}
	
	public void getAll(Course[] courses) {
		for(Course course:courses) {
			System.out.println(course.getName());
		}
	}
}
