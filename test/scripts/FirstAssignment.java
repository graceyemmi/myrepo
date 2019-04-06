package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FirstAssignment {
	WebDriver driver;
  @Test
  public void navigateMethods() {
	  
	  //To navigate
	  driver.navigate().forward();
	  
	  // To navigate to specific link
	  driver.navigate().to("https://www.wikipedia.com");
	  
	 //To getPageSource of wikipedia
	  String pageSource = driver.getPageSource();
	  System.out.println(pageSource);
	  
	  //- navigate().to(url) - ditto - driver.get()
	 driver.get("http://www.gmail.com");
	 
	 String title = driver.getTitle();
	 System.out.println("Title is-  " +title);
	 
	  //get Current URL
	  String currentUrl = driver.getCurrentUrl();
	  System.out.println("Currenturl is " +currentUrl);
	  
	  //maximize
	  driver.manage().window().maximize();
	 
  }
  @BeforeMethod
  public void beforeMethod() {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
driver = new ChromeDriver();

  }
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  driver.quit();
  }

}
