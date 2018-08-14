package myPracticeProgs;

public class RemoveDuplicateWords {

	public static void main(String[] args) 
	{
		String str="Ram has has a a duplicate copies";
		String[] schar=str.split("//s");
		String unique="";
		for(int i=0;i<=schar.length-1;i++)
		{
			if(!unique.contains(schar[i]+""))
			{
				unique=unique+schar[i];
			}
		}
		System.out.println(unique);
	}

}
