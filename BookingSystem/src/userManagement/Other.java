package userManagement;

public class Other extends User {
	 
	public Other(String username, String password, String email, int id, String studentNumber) {
		super(username, password, email, id, studentNumber);
	}
	
	public Other() {
		super();
	}
	
	@Override
	public String getUserType() {
		return "Other";
	}

	@Override
	public int getHourlyRate() {
		// TODO Auto-generated method stub
		return 50;
	}
}

