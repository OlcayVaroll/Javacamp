package odev3;

public class Student extends user{
	
	private String job;
	
	public Student() {
		
	}

	

	public Student(String job) {
		super();
		this.job = job;
	}
	
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
}
