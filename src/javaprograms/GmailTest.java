package javaprograms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

	static public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("srinivass.cool");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("jj");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

	}

}
