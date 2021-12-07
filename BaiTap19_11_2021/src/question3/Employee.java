package question3;

public class Employee {
	int employeeID;
	String name;

	public Employee(int employeeID, String name) {
		this.employeeID = employeeID;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee ID: " + employeeID + ", Name: " + name;
	}

}
