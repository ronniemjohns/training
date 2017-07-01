package patterns.structural.exercises.adapter;

public class EmployeeAdapterCSV implements Employee {
	
	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return String.valueOf(instance.getId());
	}

	@Override
	public String getFirstName() {
		return instance.getFirstName();
	}

	@Override
	public String getLastName() {
		return instance.getLastName();
	}

	@Override
	public String getEmail() {
		return instance.getEmailAddress();
	}
	
	@Override
	public String toString() {
		return "ID: " + instance.getId() + ", First name: " 
				+ instance.getFirstName() + ", Last name: " 
				+ instance.getLastName() + ", Email: " + instance.getEmailAddress();
	}

}
