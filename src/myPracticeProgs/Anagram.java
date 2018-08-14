package myPracticeProgs;

import java.util.Arrays;

public class Anagram {
	static boolean b;
	public static void main(String[] args) {

		String input="Rama Rao", input2="Rao Rama";
		
		String str1 = input.trim(), str2 = input2.trim();
		if(str1.length()==str2.length())
			{
	System.out.println("Invalid Input");
			}
		else
		{
		char[] c1 = str1.toLowerCase().toCharArray();
		char[] c2 = str2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		b = Arrays.equals(c1, c2);
		}
		if(b== true)
			System.out.println("Given Strings are Anagram");
		else
			System.out.println("Given Strings are Not Anagram");
	}

}
