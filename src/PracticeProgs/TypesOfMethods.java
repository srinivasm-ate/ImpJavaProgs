package PracticeProgs;

public class TypesOfMethods {

	public static void main(String[] args) 
	{
		TypesOfMethods obj= new TypesOfMethods();
		obj.first();
		int l= obj.second();
		System.out.println(l);
		String m= obj.third();
		System.out.println(m);
		double n=obj.fourth(25, 3);
		System.out.println(n);

	}
	public void first()
	{
		System.out.println("No Input, No Output");
	}
	
	public int second()
	{
		int a=10, b=20;
		int c=a+b;
		return c;
	}
	public String third()
	{
		String s="No Input, but some Output";
		return s;
	}
	public double fourth(double x, double y)
	{
		double z=x/y;
		return z;
	}
}
