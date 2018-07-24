package OopzExProgs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonConcept{
	
	private WebDriver driver;
	
	public static SingletonConcept instvar = null;

	private SingletonConcept() {

	}

	public WebDriver openbrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static SingletonConcept getInstance() {
		if (instvar == null)
			instvar = new SingletonConcept();
		return instvar;
	}
}
