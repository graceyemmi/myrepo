package scripts;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MultipleAlertAssignment {
	WebDriver driver;
  @Test
  public void MultipleAlerts() throws InterruptedException {
	  driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
	  
	  driver.findElement(By.id("simple")).click();
	  Alert myFirstAlert,mySecondAlert,myThridAlert;
	  myFirstAlert = driver.switchTo().alert();
	  assertEquals(myFirstAlert.getText(),"Hello! I am an alert box!");
	  //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  Thread.sleep(3000);
	  myFirstAlert.accept();
	  
	  driver.findElement(By.id("confirm")).click();
	  mySecondAlert= driver.switchTo().alert();
	  assertEquals(mySecondAlert.getText(),"Press a button!");
	  Thread.sleep(2000);
	  mySecondAlert.dismiss();
	  
	  driver.findElement(By.id("prompt")).click();
	  myThridAlert = driver.switchTo().alert();
	  assertEquals(myThridAlert.getText(),"Please enter your name");
	  Thread.sleep(3000);	  
	  myThridAlert.sendKeys("Grace Yemmi");
	  myThridAlert.accept();
	  Thread.sleep(2000);
	  myThridAlert.accept();
	  
	  
	  
	  
	  
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


