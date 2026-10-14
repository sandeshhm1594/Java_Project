import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		String check=(n%2==0)?"Number is Even":"Odd Number";
		
		System.out.println(check);
		
	}
}
