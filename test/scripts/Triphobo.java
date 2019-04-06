package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Triphobo {
	WebDriver driver;

  @Test
  public void tripplan() throws InterruptedException {
	  
	  driver.findElement(By.xpath("/html/body/main/div[3]/div[2]/div/button[1]"));
	  driver.findElement(By.xpath("//input[@type='search']"));
	  List<WebElement> loaction = driver.findElements(By.id())
  }
  	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
		  driver =new ChromeDriver();
		  driver.get("http://triphobo.com");
		  Thread.sleep(2000);
		
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
