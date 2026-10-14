import java.util.Scanner;

public class FreeBusTicket {

	public static void main(String[] args) {
		
		
		char gender='M';
		
		boolean isAadharCard=false;
		var data=true;
		
		if(gender=='F')// Outer If Statement
		{
			System.out.println("Show me AadharCard");
			if(isAadharCard==true)// Inner If Statement
			{
				System.out.println("Issued Free Ticket");
			}
			else
			{
				System.out.println("Pay Money and Get Ticket");
			}
		}
		else
		{
			System.out.println("You are not eligible");
		}
	
		
		
		
		
	}
}
