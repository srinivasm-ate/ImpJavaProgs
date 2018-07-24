package OopzExProgs;

public class SBIBank implements USBank, BrazilBank
{
	public void minbalance()
	{
		System.out.println("SBI US BRANCH Min Balance is :"+" "+ USBank.bal);
	}
	
	public void netbanking()
	{
		System.out.println("SBI US Branch Net Banking System");
	}
	
	public void cheque()
	{
		System.out.println("SBI US Branch Cheque System");
	}
	
	public void otpsystem() 
	{
		System.out.println("SBI Brazil Branch OTP System");
	}
	
	public void mobilebanking()
	{
		System.out.println("SBI Brazil Branch Mobile Banking System");
	}
	
	public void sbiownrules()
	{
		System.out.println("Each SBI Acnt Holder Must follow SBI T&C");
	}
}
