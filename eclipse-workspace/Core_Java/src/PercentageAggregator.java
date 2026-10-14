
public class PercentageAggregator {

	String name;
	
	public PercentageAggregator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PercentageAggregator(String name) {
		super();
		this.name = name;
	}
	float calculatePercentage(float sub1,float sub2,float sub3,float sub4)
	{
		float percentage=(sub1+sub2+sub3+sub4)*100/400;
		return percentage;
	}
	public static void main(String[] args) {
		
		PercentageAggregator pa1=new PercentageAggregator();
		System.out.println("Obtained percentage: "+pa1.calculatePercentage(50, 45, 70,60));
	
	System.out.println(pa1.name);
	}
}
