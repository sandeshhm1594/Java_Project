
public class Calculator {
	// Addition of 2 Numbers
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition: "+sum);
	}
	// Addition of 3 Numbers
	void add(int m,int n,int p)//  Difference in number of Parameters
	{
		int sum=m+n+p;
		System.out.println("Addition Of 3 Numbers: "+sum);
	}
	
	void add(float a,float b)
	{
		float sum=a+b;
		System.out.println("Addition Of 2 Floating Points: "+sum);
	}
	
	public static void main(String[] args) {
		Calculator calculate=new Calculator();
		calculate.add(23, 21);
		calculate.add(40,50,60);
		calculate.add(2.3f, 4.7f);
		
		
	}
}
