
public class Person {

	String name;
	int age;
	//If we create a constructor explicitly, default constructor will be overwritten
	Person()
	{
		name="Charlie Puth";
		age=31;
		
	}
	Person(String n,int a)
	{
		name=n;
		age=a;
	}
	
	public static void main(String[] args) {
		
		Person p=new Person();
		System.out.println("Person Name: "+p.name);
		System.out.println("Person Age: "+p.age);
		
		Person p1=new Person("Santhosh",41);
		System.out.println("Person Name: "+p1.name);
		System.out.println("Person Age: "+p1.age);
		
		Person p2=new Person("Sunil",21);
		System.out.println("Person Name: "+p2.name);
		System.out.println("Person Age: "+p2.age);
		
		
	}
}
