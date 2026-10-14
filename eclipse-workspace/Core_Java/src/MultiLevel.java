
public class MultiLevel {

	public static void main(String[] args) {
		
		RoyalEnfield re=new RoyalEnfield();
		re.start();//grandparent method(Vehicle)
		re.ride();//parent method(Bike)
		re.makeNoise();//own method(child)
	}
}
