package userManagement;

public class Staff extends User {
	 
	public Staff(String username, String password, String email, int id, String orgID) {
		super(username, password, email, id, orgID);
	}
	
	public Staff() {
		super();
	}
	
	@Override
	public String getUserType() {
		return "Staff";
	}

	@Override
	public int getHourlyRate() {
		// TODO Auto-generated method stub
		return 40;
	}
}
