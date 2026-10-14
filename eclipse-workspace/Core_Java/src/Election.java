import java.util.Scanner;

public class Election {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		
		if(age>=18)
			System.out.println("Voted Successfully....!!!");
		
		else
		
			System.out.println("Go home and eat lollypop");		
	}
}

//Note: If Only one line of statement is present in If or else block
//Then there is no need specify curly braces({})
