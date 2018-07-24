package javaprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Indian_Rail 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.indianrail.gov.in");
		driver.findElement(By.linkText("Trains between Stations")).click();
		driver.findElement(By.id("txtStationFrom")).sendKeys("HYDERABAD DECAN- HYB");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("txtStationTo")).sendKeys("BANGALORE CY JN- SBC");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
		
		new Select(driver.findElement(By.name("lccp_classopt"))).selectByValue("2A");
		
		driver.findElement(By.name("lccp_day")).clear();
		driver.findElement(By.name("lccp_day")).sendKeys("28");
		
		driver.findElement(By.name("lccp_month")).clear();
		driver.findElement(By.name("lccp_month")).sendKeys("5");
		
		driver.findElement(By.name("submit2")).click();
		
		

	}

}