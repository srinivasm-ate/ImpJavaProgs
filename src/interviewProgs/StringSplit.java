package interviewProgs;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
	System.out.println("Enter a String: ");
	@SuppressWarnings("resource")
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	String rev=new StringBuffer(str).reverse().toString();
	System.out.println("String Reversed using Reverse Method of String Buffer Class: "+rev);
	String reverse="";
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
	System.out.println("String Reversed using For Loop Concept: "+reverse);
	
	String[] str1= str.split("\\s");
	
	for(String word:str1) {
		System.out.println(word);
	}
	}

}
