package javaprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo_Inbox 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.yahoomail.com");
		
		driver.findElement(By.name("username")).sendKeys("venkat123456a");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(5000);		
		driver.findElement(By.name("passwd")).sendKeys("mqq987654");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(5000);
		
		//click 3 rd check box
		driver.findElement(By.xpath("(//input[@name='mid'])[position()=3]")).click();

		//click 10th checkbox
		List<WebElement> lst=driver.findElements(By.name("mid"));
		lst.get(9).click();
		
	}

}
