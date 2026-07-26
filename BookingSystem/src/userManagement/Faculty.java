package userManagement;

public class Faculty extends User {
	 
	public Faculty(String username, String password, String email, int id, String orgID) {
		super(username, password, email, id, orgID);
	}
	
	public Faculty() {
		super();
	}
	
	@Override
	public String getUserType() {
		return "Faculty";
	}

	@Override
	public int getHourlyRate() {
		// TODO Auto-generated method stub
		return 30;
	}
}
