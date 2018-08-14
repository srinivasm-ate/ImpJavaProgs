package interviewProgs;

import java.util.StringTokenizer;

public class StringOper 
{
	
	
	public static void main(String[] args) 
	{
		String s="ramarao";
		int len=s.length();
		for(int i=1;i<len;i++)
		{
			char req=s.charAt(i);
			if (req=='a')
			{
				System.out.println(req);
			}
		}
		String s1="suma";
		s1=s1.concat("sen");
		String s2="sumasen";
		if(s1.equals(s2))
			System.out.println("mutable");
		else
			System.out.println("immutable");
		System.out.println(s1);
		//System.out.println(s2);
		StringBuffer str= new StringBuffer("rama");
		StringBuffer str1=str.append("rao");
		System.out.println(str);
		System.out.println(str1);
		
		StringTokenizer st=new StringTokenizer("Automation Test Engineer");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}

}
