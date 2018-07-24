package OopzExProgs;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestSingletonConcept {
	WebDriver driver;

	@BeforeMethod
	public void beforemethod() {
		SingletonConcept obj = SingletonConcept.getInstance();
		driver = obj.openbrowser();
		driver.get("http://www.google.com");
	}

	@Test
	public void test() {
		String str = driver.getTitle();
		if (str.equals("Google"))
			System.out.println("Google HomePage Test Passed");
		else
			System.out.println("Google HomePage Test Failed");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
