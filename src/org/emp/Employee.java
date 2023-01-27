package org.emp;

public class Employee {

	private void sample(int id) {
		System.out.println("Employee id :" +id);
}
	
	public static void main(String[] args) {
		Employee a = new Employee();
		a.sample(1234);
	}
}
