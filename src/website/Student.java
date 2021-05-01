package website;

public class Student extends User{
	private String profile;
	
	public Student(int id, String userName, String password, String adress, String email, String course,String profile) {
		super(id,userName,password,adress,email,course);
		this.profile=profile;
	}
	
	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
}
