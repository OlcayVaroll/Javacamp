package odev3;

public class Main {

	public static void main(String[] args) {
		
		user userr = new user();
		
		userr.setId(51);
		userr.setName("olcay");
		userr.setLastName("varol");
		userr.setEmail("olcayv0@mail.com");
		
		System.out.println("ki�inin ismi : "+userr.getName()+ " soyismi : " + userr.getLastName() + " id'si :" + userr.getId()); 
		
		
		Student student = new Student();
		
		student.setId(0);
		student.setEmail("abc@gmail.com");
		student.setName("deneme");
		student.setLastName("abc");
		student.setJob("��renci");
		
		System.out.println("mesle�i : " + student.getJob());
		
		
		Instructor instructor = new Instructor();
		instructor.setEmail("denemelik@mail.com");
		instructor.setId(5151321);
		instructor.setName("asdas");
		instructor.setLastName("xmvn�cmvnx�c");
		instructor.setInstructorGrade("Boss");
		
		System.out.println(instructor.getName()+ "  adl� ki�inin kurumdaki derecesi " + instructor.getInstructorGrade());
		
		

	}

}
