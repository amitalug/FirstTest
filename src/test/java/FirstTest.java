import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	private WebDriver webdriver;
	 @Before
	 public void setup()
	 {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 webdriver = new ChromeDriver();
	 }
	 @After
	 public void close()
	 {
	//	 webdriver.quit();
	 }
	 @Test
	 public void simpleTest()
	 {
		 webdriver.navigate().to("http://www.dice.com");
		 String title = webdriver.getTitle();
		 assertTrue(title != "");
	 }
}
