package website;

public class Main {

	public static void main(String[] args) {
		
		User user1 =new User(001, "Ahmet","123345","Ankara", "ahmet@ahmet.com","C# & React");
		User user2 =new User(002, "Engin","002822","�zmir", "engin@engin.com","Java");
		
		UserManager usermanager =new UserManager();
		usermanager.userAdd(user1);
		usermanager.userRemove(user2);
		
		
		Student student= new Student();
		student.setId(003);
		student.setUserName("G�khan");
		student.setEmail("gokhan@gokhan.com");
		student.setAdress("Bursa");
		
		
		StudentManager studentManager =new StudentManager();
		studentManager.userDetail(student);
		
		Instructor instructor = new Instructor();
		instructor.setUserName("h�lya");
		instructor.setCourse("phyton");
		instructor.setEducation("y�ksek lisans");
		instructor.setHistory("ver yans�n halay�");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.userAdd(instructor);
			
	}

}
