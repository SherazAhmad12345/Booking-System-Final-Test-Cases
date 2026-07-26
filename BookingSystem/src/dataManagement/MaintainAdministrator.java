package dataManagement;

import java.io.File;

import java.io.FileWriter;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import administratorManagement.Administrator;

public class MaintainAdministrator {
	public ArrayList<Administrator> admins = new ArrayList<Administrator>();
	public String path;
	
	public void load(String path) throws Exception {
		this.path = path;
		admins.clear();
		
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
			String chiefEventCoordinatorField = reader.get("isChiefEventCoordinator");
			boolean isChiefEventCoordinator = Boolean.parseBoolean(chiefEventCoordinatorField);

			Administrator admin = new Administrator(username, password, email, id, isChiefEventCoordinator);
			admins.add(admin);
		}
		reader.close();
		
		//In administrators.csv I added 1 admin to test how the LoginPage will work
		//Will probably delete it from the csv after
		

	}
	
	public void save(String path) throws Exception {
		CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
		csvOutput.write("username");
		csvOutput.write("password");
		csvOutput.write("email");
		csvOutput.write("id");
		csvOutput.write("isChiefEventCoordinator");
		csvOutput.endRecord();

		for (Administrator admin : admins) {
			csvOutput.write(admin.getUsername());
			csvOutput.write(admin.getPassword());
			csvOutput.write(admin.getEmail());
			csvOutput.write(String.valueOf(admin.getAdminID()));
			csvOutput.write(String.valueOf(admin.isChiefEventCoordinator()));
			csvOutput.endRecord();
		}
		csvOutput.close();
	}
	
	public boolean usernameExists(String username) {
		for (Administrator admin : admins) {
			if (admin.getUsername().equalsIgnoreCase(username)) {
				return true;
			}
		}
		return false;
	}
	
	public  Administrator authenticate(String username, String password) {
		for (Administrator admin : admins) {
			if (admin.getUsername().equalsIgnoreCase(username) && admin.checkPassword(password)) {
				return admin;
			}
		}
		return null;
	}
	
	public int nextId() {
		int max = 0;
		for (Administrator admin : admins) {
			if (admin.getAdminID() > max) {
				max = admin.getAdminID();
			}
		}
		return max + 1;
	}
	
	public void addAdmin(Administrator admin) {
		this.admins.add(admin);
	}
 }
