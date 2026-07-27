package administratorManagement;

import java.util.ArrayList;

public final class ChiefEventCoordinator {
   private static ArrayList<Administrator> adminList = new ArrayList<Administrator>();
   private static ArrayList<String> usernames = new ArrayList<String>();
   private static ArrayList<String> passwords = new ArrayList<String>();
   private static ArrayList<String> emails = new ArrayList<String>();
   private static ChiefEventCoordinator instance = new ChiefEventCoordinator();

   public static ChiefEventCoordinator getInstance()
   {
	   return instance;
   }

   public Administrator generateAdminAccount(String username, String password, String email, int adminID)
   {
     Administrator admin = new Administrator(username, password, email, adminID);
     adminList.add(admin);
     usernames.add(username);
     passwords.add(password);
     emails.add(email);
     return admin;
   }

   public Administrator getAdministrator(String name, String password)
   {
	   if(usernames.contains(name) && passwords.get(usernames.indexOf(name)).equals(password))
	   {
		   return adminList.get(usernames.indexOf(name));
	   }

	   return null;
   }
   
	
	public boolean isStrongPassword(String password) {
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
	
	public boolean isValidEmail(String email) {
		if (email == null || email.trim().isEmpty()) {
			return false;
		}
		
		email = email.toLowerCase();
		
		String emailEnd = "@yorku.ca";
		return email.endsWith(emailEnd) && email.length() > emailEnd.length();
	}
	
	//Just for testing
	public void emptyListsForTesting()
	{
		   adminList.clear();
		   usernames.clear();
		   passwords.clear();
		   emails.clear();
	}
}
