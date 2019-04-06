package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;

//import static org.testng.Assert.assertEquals;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class SecondAssignment {
	WebDriver driver;
  @Test
  public void webElementMethods() {
	driver.get("https://www.google.com"); 
	String expectedtitle = "Google";
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
	//assertEquals(expectedtitle,actualtitle);
	if(expectedtitle.equals(actualtitle)){
		System.out.println("Titles are Same");
	}
		else {
		System.out.println("Titles are not same");
		}
	
	boolean isEnabled = driver.findElement(By.xpath("//img[@id='hplogo']")).isEnabled();
	boolean isDisplayed = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();

	if(isEnabled) {
		System.out.println("Button is Enabled");
	}
	else {
		System.out.println("Button is not Enabled");
	}
	if(isDisplayed) {
		System.out.println("Button is Enabled");
	}
	else {
		System.out.println("Button is not Enabled");
	}
	
	
  }
	
	
			
  @BeforeMethod
  public void beforeMethod() {
	  //System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver -32bit.exe");
	  System.setProperty("webdriver.gecko.driver", "E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\geckodriver -64bit.exe");
	  driver = new FirefoxDriver();
	  //driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	 //driver.quit();
	  
	  
  }

}
