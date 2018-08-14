package myPracticeProgs;

public class FibonacciNumbers {

	public static void main(String[] args) 
	{
		int a=0, b=1, c=a+b;
		System.out.println(a);
		System.out.println(b);
		while(c<10)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
			
		}

	}

}
