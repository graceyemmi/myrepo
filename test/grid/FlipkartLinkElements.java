package grid;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class FlipkartLinkElements {
	RemoteWebDriver driver;
  @Test
  public void flipkartLinks() throws InterruptedException {
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(2000);
	  List<WebElement> allFlipkartLinks = driver.findElements(By.tagName("a"));
	  for(int i=0;i<=allFlipkartLinks.size();i++) {
		  System.out.println(allFlipkartLinks.get(i).getText());
		  
	  }
	  }
	  // + "_" +allFlipkartLinks.get(i).getAttribute("href"));
  
  @BeforeMethod
  public void beforeMethod() {
	  // System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
	  //driver = new ChromeDriver();
	 
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setBrowserName("firefox");
	  try {
		driver = new RemoteWebDriver (new URL("http://192.168.0.126:4444/wd/hub"),capabilities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 /* driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);*/
		 
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
