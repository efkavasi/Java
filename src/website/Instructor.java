package website;

public class Instructor extends User {
	
	private String education;
	private String history;
	
	public Instructor () {
		
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
