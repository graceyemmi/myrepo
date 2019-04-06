package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MultipleWindows {
	WebDriver driver;
  @Test
  public void multipleWin() throws InterruptedException {
	  
	  
	  driver.get("http://cookbook.seleniumacademy.com/Config.html");
	  String actual = driver.getTitle();
	  System.out.println("The title is " +actual);
	  String parentWindow = driver.getWindowHandle();
	  driver.findElement(By.id("helpbutton")).click();
	  driver.switchTo().window("Help");
	  Thread.sleep(3000);
	  driver.switchTo().window(parentWindow);
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.findElement(By.id("chatbutton")).click();
	  driver.switchTo().window("Online Chat Support");
	  Thread.sleep(3000);
	  
	  //driver.findElement(By.id("visitbutton")).click();
	  
	 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
	  //System.setProperty("webdriver.gecko.driver","test\\resources\\geckodriver -64bit.exe");
	  driver = new ChromeDriver();
	  //driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	
  }

	  @AfterMethod
	  public void afterMethod() {
	  //driver.quit();
	  }
}
