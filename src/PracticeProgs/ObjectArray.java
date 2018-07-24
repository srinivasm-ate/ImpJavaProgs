package PracticeProgs;

public class ObjectArray {

	public static void main(String[] args) 
	{
		int m[][]=new int[3][4];
		m[0][0]=1;
		m[0][1]=2;
		m[0][2]=3;
		m[0][3]=4;

		m[1][0]=11;
		m[1][1]=22;
		m[1][2]=33;
		m[1][3]=44;
		
		m[2][0]=111;
		m[2][1]=222;
		m[2][2]=333;
		m[2][3]=444;
		
		for(int row=0;row<m.length;row++)
		{
			for(int col=0;col<m[0].length;col++)
			{
				System.out.println(m[row][col]);
			}
		}
	}

}
