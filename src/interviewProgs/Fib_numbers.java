package interviewProgs;

public class Fib_numbers 
{

	public static void main(String[] args) 
	{
	int a,b,c;
	a=1;
	b=2;
	c=a+b;
	System.out.println(a);
	System.out.println(b);
	while(c<=100)
	{
		System.out.println(c);
		a=b;
		b=c;
		c=a+b;
	}

	}

}
