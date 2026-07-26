package userManagement;

public class Partner extends User {
	 
	public Partner(String username, String password, String email, int id, String orgID) {
		super(username, password, email, id, orgID);
	}
	
	public Partner() {
		super();
	}
	
	@Override
	public String getUserType() {
		return "Partner";
	}

	@Override
	public int getHourlyRate() {
		// TODO Auto-generated method stub
		return 50;
	}
}

