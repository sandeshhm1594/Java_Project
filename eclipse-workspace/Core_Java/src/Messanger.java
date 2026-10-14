
public class Messanger {

	void sendMessage(String message)
	{
		System.out.println("Messenge sent: "+message);
	}
	
	String receiveMessage()
	{
		return "Message Received: Im fine who are you?";
	}
	
	public static void main(String[] args) {
		
		Messanger message1=new Messanger();
		message1.sendMessage("Hi,How Are You?");
		System.out.println(message1.receiveMessage());
		
	}
}
