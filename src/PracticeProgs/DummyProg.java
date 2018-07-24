package PracticeProgs;

public class DummyProg {

	public static void main(String[] args) 
	{
		int i=1;
		int j=i++;
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		
		int a[]= new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		for(int k=0; k<a.length; k++)
		{
			System.out.println(a[k]);
		}
		char ch[]=new char[2];
		ch[0]='M';
		ch[1]='S';
		for(int l=0; l<ch.length;l++)
		{
			System.out.println(ch[l]);
		}
		String str[]=new String[3];
		str[0]="hello";
		str[1]="Selenium";
		str[2]="Testers";
		for(int m=0;m<str.length;m++)
		{
			System.out.println(str[m]);
		}
		Object obj[]=new Object[6];
		obj[0]="Matta Srinivaas";
		obj[1]='M';
		obj[2]=600000;
		obj[3]=3.09;
		obj[4]="Delloite";
		obj[5]="Automation Tester";
		System.out.println(obj[0]+" "+obj[1]+" "+obj[2]+" "+obj[3]+" "+obj[4]+" "+obj[5]);
	
	}
}
