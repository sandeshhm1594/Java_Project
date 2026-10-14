import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of A");
		byte a=sc.nextByte();
//		short b=sc.nextShort();
//		int c=sc.nextInt();
//		char d=sc.next().charAt(0);
		System.out.println("Enter String1");
		String str1=sc.next();//Used to print One Word if we enter space it will stop
		sc.nextLine();//it reads leftover including whitespaces
		System.out.println("Enter String2");
		String str2=sc.nextLine();//Better Choice/It reads entire sentence
		
		System.out.println("String 1 Value: "+str1);
		System.out.println("String 2 Value: "+str2);
		
		System.out.println("A value: "+a);
		
		
	}
}
