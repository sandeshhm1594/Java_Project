
public class Employee {

	int employeeId;
	String employeeName;
	double salary;
	String dept;
	final String company="PentagonSpace";
	static final int MAX_MARKS=100;
	

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.employeeId=420;
		emp.employeeName="Shivakumar";
		emp.salary=42000;
		emp.dept="Sales";
		System.out.println("Employee ID: "+emp.employeeId);
		System.out.println("Employee Name: "+emp.employeeName);
		System.out.println("Salary: "+emp.salary);
		System.out.println("Department: "+emp.dept);
		
		
	}
}
