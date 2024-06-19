package ExamPractice;

public class EmployeeRecord {
	private Person employee;
	private int employeeID;
	
	public EmployeeRecord(Person e, int ID) {
		setInfo(e, ID);	// Use setInfo to not have doubled code
	}
	
	public EmployeeRecord(EmployeeRecord er) {
		employee = er.getEmployee();	// Looks like shallow copy but new person is created in getEmployee() method
		employeeID = er.getID();
		
	}
	
	public void setInfo(Person e, int ID) {
		employee = e;
		employeeID = ID;
	}
	
	public Person getEmployee() {
		// Return new Person to avoid data holes
		return new Person(employee.getFirstName(), employee.getLastName());
	}
	
	public int getID() {
		return employeeID;
	}
}
