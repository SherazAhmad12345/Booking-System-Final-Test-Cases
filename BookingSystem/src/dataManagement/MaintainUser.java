package dataManagement;

import java.io.File;

import java.io.FileWriter;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import userManagement.User;
import userManagement.UserFactory;

public class MaintainUser {
	public ArrayList<User> users = new ArrayList<User>();
	public String path;
	
	public void load(String path) throws Exception {
		this.path = path;
		users.clear();
		
		File file = new File(path);
		if (!file.exists()) {
			return;
		}
		
		CsvReader reader = new CsvReader(path);
		reader.readHeaders();
		
		while (reader.readRecord()) {
			String username = reader.get("username");
			String password = reader.get("password");
			String email = reader.get("email");
			int id = Integer.parseInt(reader.get("id"));
			String type = reader.get("type");
			String orgIdOrStudentNumber = reader.get("orgIdOrStudentNumber");

			User user = UserFactory.createUser(type, username, password, email, id, orgIdOrStudentNumber);
			users.add(user);
		}
		reader.close();
	}
	
	public void save(String path) throws Exception {
		CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
		csvOutput.write("username");
		csvOutput.write("password");
		csvOutput.write("email");
		csvOutput.write("id");
		csvOutput.write("type");
		csvOutput.write("orgIdOrStudentNumber");
		csvOutput.endRecord();

		for (User u : users) {
			csvOutput.write(u.getUsername());
			csvOutput.write(u.getPassword());
			csvOutput.write(u.getEmail());
			csvOutput.write(String.valueOf(u.getId()));
			csvOutput.write(u.getUserType());
			csvOutput.write(u.getOrgIdOrStudentNumber());
			csvOutput.endRecord();
		}
		csvOutput.close();
	}
	
	public boolean usernameExists(String username) {
		for (User u : users) {
			if (u.getUsername().equalsIgnoreCase(username)) {
				return true;
			}
		}
		return false;
	}

	public boolean emailExists(String email) {
		for (User u : users) {
			if (u.getEmail().equalsIgnoreCase(email)) {
				return true;
			}
		}
		return false;
	}
	
	public User authenticate(String username, String password) {
		for (User u : users) {
			if (u.getUsername().equalsIgnoreCase(username) && u.checkPassword(password)) {
				return u;
			}
		}
		return null;
	}
	
	public int nextId() {
		int max = 0;
		for (User u : users) {
			if (u.getId() > max) {
				max = u.getId();
			}
		}
		return max + 1;
	}
	
	public void addUser(User user) {
		users.add(user);
	}
 }
