
public class Food {

	void order(String foodName)
	{
		System.out.println("Food : "+foodName+" has been Ordered");
	}
	void order(String foodName,int quantity)
	{
		System.out.println("Food : "+foodName+" has bean Ordered");
		System.out.println("Quantity : "+quantity);
	}
	void order(String foodName,int quantity,String softDrinks)
	{
		System.out.println("Food : "+foodName+" has been Ordered");
		System.out.println("Quantity : "+quantity);
		System.out.println("Soft Drinks : "+softDrinks);
	}
	public static void main(String[] args) {
	
		Food food=new Food();
		food.order("Chicken Biriyani");
		food.order("Chocolate Maggie",3);
		food.order("Pani Puri",5,"Mango Juice");	
	}
}
