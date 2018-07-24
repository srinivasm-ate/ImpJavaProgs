package javaprograms;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Mail 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.name("username")).sendKeys("srinivasm.tester");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(5000);		
		driver.findElement(By.name("passwd")).sendKeys("abc9876");
		driver.findElement(By.name("signin")).click();
		
		try
		{
			if(driver.findElement(By.linkText("Sign Out")).isDisplayed())
			{
				System.out.println("Login is success");
				driver.findElement(By.linkText("Sign Out")).click();
			}
		}
		catch(Exception e)
		{
			String str=driver.findElement(By.id("mbr-login-error")).getText();
			System.out.println("Login is failed  :"+str);
		}
		driver.close();
		

	}

}

