package interviewProgs;

public class ReverseString {
	static String str1, str2;

	public static void main(String[] args)
	    {
	        String str1, str2="", str3;
	        str1="MalayalaM";
	        str3=str1;
	        for(int i=str1.length()-1; i>=0; i--)
	        {
	        	str2=str2+str1.charAt(i);
	        }
	        System.out.println("Given String After reversed is: "+str2);
	        if(str3.equalsIgnoreCase(str2))
	        System.out.println("Given String "+str2+ " is Pallindrome");
	        else
	        System.out.println("Given String "+str2+ " is not Pallindrome");
	    }

		 /*System.out.println("Enter string to reverse:");
	        
	        @SuppressWarnings("resource")
			Scanner read = new Scanner(System.in);
	        str1 = read.nextLine();
	        str2=str1;
	        String reverse = "";
	        
	        
	        for(int i = str1.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + str1.charAt(i);
	        }
	        System.out.println("Reversed string is: "+reverse);
	        if (reverse.equalsIgnoreCase(str2))
	        {
	        	System.out.println("Given String is Pallindrome");
	        }else
	        {
	        	System.out.println("Given String is not Pallindrome");
	        }
	    }*/
}
