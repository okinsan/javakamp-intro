package kodlamaIO;

public class Course {
	private int id;
	private int completeRate;
	private String name;
	private String instructorName;
	
	public Course(int id, int completeRate, String name,String educatorName){
		this.id=id;
		this.completeRate=completeRate;
		this.name=name;
		this.instructorName=educatorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCompleteRate() {
		return completeRate;
	}

	public void setCompleteRate(int completeRate) {
		this.completeRate = completeRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
}
