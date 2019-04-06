package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FlipkartLinkElements {
	WebDriver driver;
  @Test
  public void flipkartLinks() {
	  List<WebElement> allFlipkartLinks = driver.findElements(By.tagName("a"));
	  for(int i=0;i<=allFlipkartLinks.size();i++) {
		  System.out.println(allFlipkartLinks.get(i).getText());
		  
	  }
	  }
	  // + "_" +allFlipkartLinks.get(i).getAttribute("href"));
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
		 
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
