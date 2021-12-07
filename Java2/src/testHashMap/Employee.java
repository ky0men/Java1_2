package testHashMap;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	String name;
	int salary;

	public Employee(String name) {
		this.name = name;
		this.salary = 5600;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Salary: " + salary;
	}

	public static void main(String[] args) {
		Map<String, Employee> staffObj = new HashMap<>();
		staffObj.put("101", new Employee("Bum"));
		staffObj.put("102", new Employee("Teo"));
		staffObj.put("103", new Employee("Ku"));
		System.out.println(staffObj);
		staffObj.remove("103");
		staffObj.put("106", new Employee("Tinh"));
		System.out.println(staffObj.get("106"));
		System.out.println(staffObj);
	}
}
