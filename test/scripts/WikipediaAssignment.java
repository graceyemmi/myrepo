package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import static org.testng.Assert.assertEquals;
public class WikipediaAssignment {
	
	WebDriver driver;
  
@Test
  public void wikipediaenglish() {
	  driver.findElement(By.id("js-link-box-en")).click();
	  driver.findElement(By.id("searchInput")).sendKeys("Selenium");
	  driver.findElement(By.xpath("//input[@id='searchButton']")).click();
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "Selenium - Wikipedia";
	  
	  if(expectedTitle.equals(actualTitle)) {
		  System.out.println("PASSED");
	  }
	  else {
		  System.out.println("FAILED");
	  }
	
	//assertEquals(actualTitle ,expectedTitle);
	
	String heading = driver.findElement(By.tagName("h1")).getText();
	System.out.println(heading);
	
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.wikipedia.org/");
	  
	  
  
  }
  
  

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
