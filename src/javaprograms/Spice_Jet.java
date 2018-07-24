package javaprograms;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spice_Jet
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
		driver.get("http://www.spicejet.com");
		
		driver.findElement(By.xpath("//input[@value='OneWay']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		

		WebElement lastcal=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']"));
		
		while(lastcal.findElement(By.xpath("div/div/span[1]")).getText().matches("June")==false)
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			lastcal=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']"));
		}
		
		lastcal.findElement(By.linkText("24")).click();
		
	}

}
