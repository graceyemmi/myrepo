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

public class AlertFirstAssignment {
	WebDriver driver;
  @Test
  public void AlertFirst() throws InterruptedException {
	  
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	  
	  Alert myAlert,myAlert1,myAlert2;
	  
	  myAlert = driver.switchTo().alert();
	  assertEquals(myAlert.getText(),"I am a JS Alert");
	  Thread.sleep(3000);
	  myAlert.accept();
	  
	  driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	  myAlert1 = driver.switchTo().alert();
	  assertEquals(myAlert1.getText(),"I am a JS Confirm");
	  Thread.sleep(3000);
	  myAlert1.dismiss();
	  
	  driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	  
	   myAlert2=driver.switchTo().alert();
	  //assertEquals(myAlert2.getText(),"I am a JS Prompt");
	   //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	  myAlert2.sendKeys("Congratulations first assignment completed");
	  Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  myAlert2.accept();
	  
	  
	  
	  
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
	 // driver.quit();
  }

}
