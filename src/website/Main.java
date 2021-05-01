package website;

public class Main {

	public static void main(String[] args) {
		
		User user1 =new User(001, "Ahmet","123345","Ankara", "ahmet@ahmet.com","C# & React");
		User user2 =new User(002, "Engin","002822","İzmir", "engin@engin.com","Java");
		
		UserManager usermanager =new UserManager();
		usermanager.userAdd(user1);
		usermanager.userRemove(user2);
		
		
		Student student= new Student();
		student.setId(003);
		student.setUserName("Gökhan");
		student.setEmail("gokhan@gokhan.com");
		student.setAdress("Bursa");
		
		
		StudentManager studentManager =new StudentManager();
		studentManager.userDetail(student);
		
		Instructor instructor = new Instructor();
		instructor.setUserName("hülya");
		instructor.setCourse("phyton");
		instructor.setEducation("yüksek lisans");
		instructor.setHistory("ver yansın halayı");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.userAdd(instructor);
			
	}

}
