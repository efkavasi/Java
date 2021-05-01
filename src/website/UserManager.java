package website;

public class UserManager {
	
		public void userAdd(User users) {
		System.out.println( users.getUserName() +" "+ users.getCourse() +" " + "Kullanýcý eklendi");
		}
		public void userDetail(User user) {
			System.out.println( user.getEmail() +" "+ user.getAdress() +" " + "Kullanýcý Detaylarý");
		}
		public void userRemove(User user) {
			System.out.println( user.getUserName() +" "+ user.getId() +" " + "Kullanýcý silindi");
		}
		
	}
