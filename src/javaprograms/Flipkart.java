package javaprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart 
{

	public static void main(String[] args) 
	{	
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement w=driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		new Actions(driver).moveToElement(w).perform();
		
		driver.findElement(By.linkText("Pendrives")).click();

	}

}
