package website;

public class User {
	 int id;
	 String userName;
	 String password;
	 String adress;
	 String email;
	 String course;
	
		public User() {}
	
		public User(int id, String userName, String password, String adress, String email, String course) {
		this.id=id;
		this.userName=userName;
		this.password=password;
		this.adress=adress;
		this.email=email;
		this.course=course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
