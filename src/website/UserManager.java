package website;

public class UserManager {
	
		public void userAdd(User users) {
		System.out.println( users.getUserName() +" "+ users.getCourse() +" " + "Kullan�c� eklendi");
		}
		public void userDetail(User user) {
			System.out.println( user.getEmail() +" "+ user.getAdress() +" " + "Kullan�c� Detaylar�");
		}
		public void userRemove(User user) {
			System.out.println( user.getUserName() +" "+ user.getId() +" " + "Kullan�c� silindi");
		}
		
	}
