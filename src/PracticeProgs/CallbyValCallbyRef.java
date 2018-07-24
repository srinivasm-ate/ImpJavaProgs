package PracticeProgs;

public class CallbyValCallbyRef {

	int p, q;
	
	public static void main(String[] args) {
		int x=10, y=20;
		
		CallbyValCallbyRef obj = new CallbyValCallbyRef();
		int z=obj.sum(x, y); // Call By Value or Pass By Value
		System.out.println(z);
		
		obj.p=15;
		obj.q=25;
		
		obj.swap(obj); // Call By Reference or Pass By Reference
		
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	public int sum(int a, int b)
	{
		int c = a+b;
		return c;
	}
	public void swap(CallbyValCallbyRef t)
	{
		int temp=t.p;
		t.p=t.q;
		t.q=temp;
	}

}
