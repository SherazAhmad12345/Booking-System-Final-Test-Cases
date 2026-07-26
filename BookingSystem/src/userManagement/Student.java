package userManagement;

public class Student extends User {
	 
	public Student(String username, String password, String email, int id, String studentNumber) {
		super(username, password, email, id, studentNumber);
	}
	
	public Student() {
		super();
	}
	
	@Override
	public String getUserType() {
		return "Student";
	}

	@Override
	public int getHourlyRate() {
		// TODO Auto-generated method stub
		return 20;
	}
}
