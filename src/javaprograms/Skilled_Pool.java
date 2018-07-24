package javaprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Skilled_Pool
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.skilledpool.com");

		new Actions(driver).moveToElement(driver.findElement(By.xpath("//a[text()='Sign up']"))).perform();
		
		driver.findElement(By.linkText("Employer")).click();
		
		
		new Select(driver.findElement(By.id("country_code1"))).selectByVisibleText("India");
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("state"))).selectByVisibleText("Assam");
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("city"))).selectByVisibleText("Agia");
		
		
	}

}

