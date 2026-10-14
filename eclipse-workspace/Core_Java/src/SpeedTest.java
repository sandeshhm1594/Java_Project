import java.util.Scanner;

public class SpeedTest {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Speed");
		int speed=sc.nextInt();
		
		String status=(speed>=100)?"High Speed":
			(speed<=60)?"Slow":"Moderate";
		System.out.println("Status: "+status);
		
	}
}
