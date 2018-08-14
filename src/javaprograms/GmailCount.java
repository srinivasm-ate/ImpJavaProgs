package javaprograms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailCount{

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();*/
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("srinivass.cool");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("jkk");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		WebElement table=driver.findElement(By.xpath("//tr[@class='zA zE']//parent::tbody"));
		int i=table.findElements(By.tagName("tr")).size();
		Thread.sleep(5000);
		System.out.println("No.of Mails are "+i);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Sign out")).click();
		driver.quit();
		//autmation.testing369
		//test@999
	}

}
