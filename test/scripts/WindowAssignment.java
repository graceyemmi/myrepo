package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WindowAssignment {
	WebDriver driver;
  @Test
  public void windowAssignment() throws InterruptedException {
	 // String parentWindowHandle = driver.getWindowHandle();
	  String expectedTitle = "Build my Car - Configration";
	  String actualTitle = driver.getTitle();
	  assertEquals(actualTitle, expectedTitle);
	  
	  driver.findElement(By.xpath("//button[@id='helpbutton']")).click();
	  
	  
	  driver.switchTo().window("HelpWindow");
	  System.out.println("Title of help window" +driver.getTitle());
	  
	  Thread.sleep(2000);
	  driver.switchTo().defaultContent();
	 
	  /*driver.findElement(By.xpath("//button[@id='chatbutton']")).click();
	  driver.switchTo().window("OnlineChat");
	  System.out.println("Title of online window" +driver.getTitle());
	  Thread.sleep(2000);
	 // driver.switchTo().defaultContent();
	 
	  driver.findElement(By.xpath("//button[@id='visitbutton']")).click();
	  driver.switchTo().window("VisitUsWindow");
	  System.out.println("Title of visitus window" +driver.getTitle());
	  
	  Set<String> windowIds = driver.getWindowHandles();
	  Iterator<String> iter = windowIds.iterator();
	  String mainWindow = iter.next();
	  String childWindow = iter.next();
	  
	  driver.switchTo().window(childWindow);
	  
	  
	  
	  
	  
	  Thread.sleep(1000);
	  
  }
  private void assertEquals(String actualTitle, String expectedTitle) {
	// TODO Auto-generated method stub
	*/
}
@BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
	  driver =new ChromeDriver();
	  driver.get("http://cookbook.seleniumacademy.com/Config.html");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
