package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, 50, "C#", "Engin D");
		Course course2 = new Course(2, 0, "JAVA", "Engin D");
		Course course3 = new Course(3, 0, "Matematik", "Oğuz K");

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.getName() + ", " + course.getInstructorName());
		}
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.update(course2);
		courseManager.delete(course3);

		courseManager.getAll(courses);
	}

}
