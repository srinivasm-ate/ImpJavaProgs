package javaprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='lsb']")).click();
		Thread.sleep(5000);
		
		List<WebElement> lst=driver.findElements(By.xpath("//a[contains(text(),'Python')]"));
		
		for(int i=0;i<lst.size();i++)
		{
			lst.get(i).click();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(3000);
			lst=driver.findElements(By.xpath("//a[contains(text(),'Python')]"));
		}
		

	}

}

