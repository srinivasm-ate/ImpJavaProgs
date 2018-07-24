package javaprograms;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HDFC_Bank 
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.hdfcbank.com");
		
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(3000);
		
		ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://netbanking.hdfcbank.com/netbanking/' and @class='btn btn-default redBtn']")).click();
		
	}

}
