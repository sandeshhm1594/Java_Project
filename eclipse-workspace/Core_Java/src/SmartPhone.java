
public class SmartPhone extends Phone{

	
	void takePhoto()
	{
		System.out.println("Taking high resolution Photo");
	}
	public static void main(String[] args) {
		
		SmartPhone sp=new SmartPhone();
		sp.takePhoto();
		sp.makeCall();
		
		
		
	}
}
