package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class AllGoogleLinks {
	WebDriver driver;
  @Test
  public void printAllGoogleLinks() {
	  
	  List<WebElement> googleLinks = driver.findElements(By.tagName("a"));
	  
	  for (WebElement oneElement:googleLinks) {
		  System.out.println(oneElement.getText()+ " " +oneElement.getAttribute("href"));
	  }
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	 System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
	 //System.setProperty("webdriver.ie.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\IEDriverServer.exe");
	 driver = new ChromeDriver(); 
	// driver = new InternetExplorerDriver();
			 
	 driver.get("http://www.google.com");
	 driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
	 
	 
  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }
  
  

}
