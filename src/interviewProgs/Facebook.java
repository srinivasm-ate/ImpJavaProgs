package interviewProgs;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com");
	
		new Select(driver.findElement(By.id("day"))).selectByIndex(14);
		new Select(driver.findElement(By.id("month"))).selectByValue("10");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1987");
		Thread.sleep(5000);
		
		File scrn = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrn, new File("D:\\My Sites\\facebook.png"));
		driver.quit();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.pollingEvery(5, TimeUnit.SECONDS)
				.until(ExpectedConditions.elementToBeClickable((driver.findElement(By.xpath("")))));
		driver.quit();
		

	}


}
