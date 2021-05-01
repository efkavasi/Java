package website;

public class Instructor extends User {
	
	private String education;
	private String history;
	
	public Instructor (int id, String userName, String password, String adress, String email, String course,String education, String history) {
		super(id,userName,password,adress,email,course);
		this.education=education;
		this.history=history;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}
}
