package interviewProgs;
public class ReverseNumber
{
    public static void main(String args[])
    {
        int a, b, c,x=0;
        c=121212161;
        b=c;
        while(c>0)
        {
        	a=c%10;
        	x=x*10+a;
        	c=c/10;
        }
    	System.out.println(x);
    	if(b==x)
    	System.out.println("Given number "+x+" is pallindrome");
    	else
    	System.out.println("Given number "+x+" is not pallindrome");
    }	
}