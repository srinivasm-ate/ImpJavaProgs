package interviewProgs;

import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String args[])
    {
        int n, m, a = 0,x;
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        m = n;
        while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
        System.out.println("Number After Reversed is: "+a);
        if(a == m)
        {
            System.out.println("Given number "+m+" is Palindrome");
        }
        else
        {
            System.out.println("Given number "+m+" is Not Palindrome");
        }
    }
}