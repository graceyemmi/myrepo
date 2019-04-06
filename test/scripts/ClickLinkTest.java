package scripts;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickLinkTest {
	WebDriver driver;	
	@Test
	public void Display() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='start']/button]")).click();
		Thread.sleep(4000);
		String actual = driver.findElement(By.id("finish")).getText();
		String expected = "Hello World!";
		assertEquals(expected,actual);
	}




	@BeforeMethod
	  public void BeforeMethod() throws InterruptedException{
	  
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
	  driver = new ChromeDriver();
	  driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
	  Thread.sleep(5000);
	  //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	  //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	  //driver.manage().window().maximize();
	  
}

@AfterMethod
public void afterMethod() {
  driver.quit();
}

}


