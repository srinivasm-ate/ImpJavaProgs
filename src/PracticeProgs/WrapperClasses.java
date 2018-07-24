package PracticeProgs;

public class WrapperClasses {

	public static void main(String[] args) 
	{
		String s= "100";
		int i=Integer.parseInt(s); //String to Integer conversion
		System.out.println(i+23);
		
		String r="25.32";
		double d=Double.parseDouble(r); //String to Double Conversion
		System.out.println(d+0.36);
		
		String n="235nm"; //NumberFormatException, because value of n is an pure integer
		int u=Integer.parseInt(n);
		System.out.println(u);
		
		int f=235;
		String z=String.valueOf(f); //Conversion from integer to String
		System.out.println((z+20) +" is a String Now");

	}

}
