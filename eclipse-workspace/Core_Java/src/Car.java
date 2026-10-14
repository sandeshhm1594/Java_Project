
public class Car {

	String carName;
	String brand;
	double price;
	String color;
	
	void addCarDetails(String n,String b,double p,String c)
	{
		carName=n;
		brand=b;
		price=p;
		color=c;
	}
	
	void display()
	{
		System.out.println("Car Details");
		System.out.println("Car Name: "+carName);
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Color : "+color);
	}
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.addCarDetails("SKODA SLAVIA", "SKODA", 2000000, "White");
		car1.display();
		
		Car car2=new Car();
		car2.addCarDetails("Fortuner", "Toyota", 5000000, "Black");
		car2.display();
		
	}
}
