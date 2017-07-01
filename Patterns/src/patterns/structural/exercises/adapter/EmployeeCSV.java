package patterns.structural.exercises.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {   // notice not implementing an interface here

	private int id;   // notice this is different
	private String firstname;  // notice this is different
	private String lastname;  // notice this is different
	private String emailAddress;
	
	public EmployeeCSV(String values) {
		StringTokenizer tokenizer = new StringTokenizer(values, ",");
		if(tokenizer.hasMoreElements()) {
			id = Integer.parseInt(tokenizer.nextToken());
		}
		if(tokenizer.hasMoreElements()) {
			firstname = tokenizer.nextToken();
		}
		if (tokenizer.hasMoreElements()) {
			lastname = tokenizer.nextToken();
		}
		if (tokenizer.hasMoreElements()) {
			emailAddress = tokenizer.nextToken();
		}
	}
	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	

	
	
}
