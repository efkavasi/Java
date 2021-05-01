package website;

public class Main {

	public static void main(String[] args) {
		
		User user1 =new User(001, "Ahmet","123345","Ankara", "ahmet@ahmet.com","C# & React");
		User user2 =new User(002, "Engin","002822","İzmir", "engin@engin.com","Java");
		
		UserManager usermanager =new UserManager();
		usermanager.userAdd(user1);
		usermanager.userRemove(user2);
		
		
		Student student= new Student(005, "Gökhan", "asdasd", "İstanbul", "gokhan@gokhan.com","java","Hacettepe");
		
		StudentManager studentManager =new StudentManager();
		studentManager.userDetail(student);
		
		Instructor instructor = new Instructor(007, "Hülya", "wwww123", "Bursa", "hülya@hülya.com", "python", "yüksek lisans", "İstanbul Teknik Üniversitesi");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.userAdd(instructor);
			
	}

}
