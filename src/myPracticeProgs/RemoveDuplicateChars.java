package myPracticeProgs;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
	
		String str="ssrriii ram rai ram";
		String unique="";
		char [] ch=str.toCharArray();
		for(int i=0;i<=str.length()-1;i++)
		if(!unique.contains(ch[i]+""))
			unique=unique+ch[i];
		System.out.println(unique);
		
		
		
		
		
		
		/*	 String str = "raamaaraaa";
		    char[] c = str.toCharArray();
		    String op = "";

		    for(int i=0; i<=c.length-1; i++){
		        if(!op.contains(c[i] + ""))
		        op = op + c[i];
		    }
		    System.out.println(op);*/

	}

}
