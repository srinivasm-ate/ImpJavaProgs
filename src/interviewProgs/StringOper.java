package interviewProgs;

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

	}

}
