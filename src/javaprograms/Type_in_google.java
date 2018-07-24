package javaprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Type_in_google 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	
	}

}
