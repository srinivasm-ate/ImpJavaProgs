package OopzExProgs;

public class test 
{

	public static void main(String[] args)
	{
		AUDI a=new AUDI();
		a.start();
		a.engine();
		a.licence();
		a.theftsafety();
		a.vehicle();
		
		System.out.println("**************");
		
		Car c=new Car();
		c.start();
		c.engine();
		c.licence();
		
		System.out.println("**************");
		
		Car ca=new AUDI();
		ca.start();
		ca.engine();
		ca.licence();
	}
	
}
