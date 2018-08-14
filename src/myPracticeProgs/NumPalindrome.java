package myPracticeProgs;

public class NumPalindrome {

	public static void main(String[] args) {
		int a, b, c, d;
		a = 136;
		b = a;
		d = 0;

		while (a > 0) {
			c = a % 10;
			d = d * 10 + c;
			a = a / 10;
		}
		System.out.println(d);
		if(b==d)
			System.out.println("Given Num "+a+" is Palindrome");
		else
			System.out.println("Given Num "+a+" is not Palindrome");
	}

}
