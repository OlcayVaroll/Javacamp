package odev3;

public class Instructor extends user {
	
	private String �nstructorGrade;
	
	public Instructor() {
		
	}
	

	public Instructor(String instructorGrade) {
		super();
		�nstructorGrade = instructorGrade;
	}
	

	public String getInstructorGrade() {
		return �nstructorGrade;
	}

	public void setInstructorGrade(String instructorGrade) {
		�nstructorGrade = instructorGrade;
	}

}
