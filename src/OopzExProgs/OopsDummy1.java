package OopzExProgs;

public class OopsDummy1 {
	
	int mod; //Global Variable or Class Variable
	String compmany, price; //Global Variable or Class Variable
	
	public static void main(String[] args) 
	{
		OopsDummy1 a= new OopsDummy1(); //new OopsDummy1() ---- Object, a --- Object reference variable
		OopsDummy1 b= new OopsDummy1();
		OopsDummy1 c= new OopsDummy1();
		
		a.mod=2018;	// All global variables copies will be given for each object created for OopsDummy1 Class 
		a.compmany="Audi";
		a.price="20 Lakh";
		
		b.mod=2018;
		b.compmany="BMW";
		b.price="30 Lakh";
		
		c.mod=2018;
		c.compmany="Chevorlet";
		c.price="40 Lakh";
		
		System.out.println(a.mod+" "+a.compmany+" "+a.price); //+ is an string concatenation operator
		System.out.println(b.mod+" "+b.compmany+" "+b.price);
		System.out.println(c.mod+" "+c.compmany+" "+c.price);
		
	}

}
