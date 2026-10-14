import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		int balance=1000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Option");
		System.out.println("1. Deposit \n2. Withdrawl\n3. Balance");
		int opt=sc.nextInt();
		int amount;
		if(opt==1)
		{
			System.out.println("Enter amount to Deposit");
			amount=sc.nextInt();
			balance=balance+amount;
			System.out.println("Balance After Deposit : "+balance);
		}
		
	}
}
