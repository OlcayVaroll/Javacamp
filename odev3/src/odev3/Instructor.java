package odev3;

public class Instructor extends user {
	
	private String ýnstructorGrade;
	
	public Instructor() {
		
	}
	

	public Instructor(String instructorGrade) {
		super();
		ýnstructorGrade = instructorGrade;
	}
	

	public String getInstructorGrade() {
		return ýnstructorGrade;
	}

	public void setInstructorGrade(String instructorGrade) {
		ýnstructorGrade = instructorGrade;
	}

}
