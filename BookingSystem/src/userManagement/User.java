package userManagement;

public abstract class User {
	
	protected String username;
	protected String password;
	protected String email;
	protected int id;
	//organization ID (faculty/staff/partner) or student number (student/other)
	protected String orgIdOrStudentNumber;

	public User(String username, String password, String email, int id, String orgIdOrStudentNumber) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.id = id;
		this.orgIdOrStudentNumber = orgIdOrStudentNumber;
	}
	
	public User() {
		
	}
	
	public abstract String getUserType();
	public abstract int getHourlyRate();
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getOrgIdOrStudentNumber() {
		return orgIdOrStudentNumber;
	}

	public void setOrgIdOrStudentNumber(String orgIdOrStudentNumber) {
		this.orgIdOrStudentNumber = orgIdOrStudentNumber;
	}
	
	public boolean checkPassword(String attempt) {
		return this.password != null && this.password.equals(attempt);
	}
	
	@Override
	public String toString() {
		return getUserType() + " [username=" + username + ", email=" + email + ", id=" + id + "]";
	}
}
