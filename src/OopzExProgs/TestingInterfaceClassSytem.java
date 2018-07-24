package OopzExProgs;

public class TestingInterfaceClassSytem {

	public static void main(String[] args) 
	{
		SBIBank sbi=new SBIBank();
		sbi.minbalance();
		sbi.netbanking();
		sbi.cheque();
		
		sbi.otpsystem();
		sbi.mobilebanking();
		
		sbi.sbiownrules();
		
		USBank us=new SBIBank();
		us.minbalance();
		us.netbanking();
		us.cheque();
		
		BrazilBank b=new SBIBank();
		b.otpsystem();
		b.mobilebanking();
		

	}

}
