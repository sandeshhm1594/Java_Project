import java.util.Scanner;

public class SalaryAggregator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
		System.out.println("Enter Percentage");
		int percentage=sc.nextInt();
		double updatedSalary=salary+(salary*percentage/100);
		System.out.println("Salary After Hike "+updatedSalary);
	}
}
