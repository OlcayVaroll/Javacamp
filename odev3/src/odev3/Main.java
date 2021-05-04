package odev3;

public class Main {

	public static void main(String[] args) {
		
		user userr = new user();
		
		userr.setId(51);
		userr.setName("olcay");
		userr.setLastName("varol");
		userr.setEmail("olcayv0@mail.com");
		
		System.out.println("kiþinin ismi : "+userr.getName()+ " soyismi : " + userr.getLastName() + " id'si :" + userr.getId()); 
		
		
		Student student = new Student();
		
		student.setId(0);
		student.setEmail("abc@gmail.com");
		student.setName("deneme");
		student.setLastName("abc");
		student.setJob("öðrenci");
		
		System.out.println("mesleði : " + student.getJob());
		
		
		Instructor instructor = new Instructor();
		instructor.setEmail("denemelik@mail.com");
		instructor.setId(5151321);
		instructor.setName("asdas");
		instructor.setLastName("xmvnöcmvnxöc");
		instructor.setInstructorGrade("Boss");
		
		System.out.println(instructor.getName()+ "  adlý kiþinin kurumdaki derecesi " + instructor.getInstructorGrade());
		
		

	}

}
