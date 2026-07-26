package userManagement;

public class UserFactory {
	public static User createUser(String userType, String username, String password, String email, int id,
			String orgIdOrStudentNumber) {
		if (userType == null) {
			throw new IllegalArgumentException("userType cannot be null");
		}

		switch (userType.trim().toLowerCase()) {
		case "student":
			return new Student(username, password, email, id, orgIdOrStudentNumber);
		case "faculty":
			return new Faculty(username, password, email, id, orgIdOrStudentNumber);
		case "staff":
			return new Staff(username, password, email, id, orgIdOrStudentNumber);
		case "partner":
			return new Partner(username, password, email, id, orgIdOrStudentNumber);
		case "other":
			return new Other(username, password, email, id, orgIdOrStudentNumber);
		default:
			throw new IllegalArgumentException("Unknown user type: " + userType);
		}
	}
	
	public static boolean isStrongPassword(String password) {
	       if (password.length() < 8) {
	           return false;
	       }

	       boolean hasUpper = false;
	       boolean hasLower = false;
	       boolean hasDigit = false;
	       boolean hasSymbol = false;

	       for (int i = 0; i < password.length(); i++) {
	           char c = password.charAt(i);
	           if (Character.isUpperCase(c)) {
	               hasUpper = true;
	           } else if (Character.isLowerCase(c)) {
	               hasLower = true;
	           } else if (Character.isDigit(c)) {
	               hasDigit = true;
	           } else {
	               hasSymbol = true;
	           }
	       }

	       return hasUpper && hasLower && hasDigit && hasSymbol;
	   }
		
		public static boolean isValidEmail(String email, String userType) {
			if (email == null || email.trim().isEmpty()) {
				return false;
			}
			
			email = email.toLowerCase();
			
			boolean isStaffType =  userType.equals("Faculty") || userType.equals("Staff");
			boolean isStudentType = userType.equals("Student");
			
			if(isStaffType)
			{
				String emailEnd = "@yorku.ca";
				return email.endsWith(emailEnd) && email.length() > emailEnd.length();
			}
			
			if(isStudentType)
			{
				String emailEnd = "@my.yorku.ca";
				return email.endsWith(emailEnd) && email.length() > emailEnd.length();				 
			}
			
			//User not related to the university
			
			int atPosition = email.indexOf('@');
			int lastDotPosition = email.lastIndexOf('.');
			
			//Making sure that the last dotted position is after the @ and not at the end of the email
			return atPosition > 0 && 
					lastDotPosition > atPosition + 1 &&
					lastDotPosition < email.length()-1;
			
		}
}
