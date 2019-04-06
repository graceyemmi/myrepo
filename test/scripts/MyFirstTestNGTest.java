package scripts;
//import java.lang.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class MyFirstTestNGTest {
	WebDriver driver;
  @Test
  public void seleniumExampleLogin() {
	  driver.get("http://selenium-examples.nichethyself.com");
	  WebElement username = driver.findElement(By.id("loginname"));
	  username.sendKeys("stc123");
	  driver.findElement(By.id("loginpassword")).sendKeys("12345");
	  driver.findElement(By.id("loginbutton")).click();


	  String expectedTitle = "My account";
	  String actualTitle = driver.getTitle();
	  if(expectedTitle.equals(actualTitle)) 
	  	System.out.println("Login test case PASSED");
	  	else
	  	System.out.println("Login test case FAILED");

  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 /* System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
	  //System.setProperty("webdriver.gecko.driver","test\\resources\\geckodriver -64bit.exe");
	  driver = new ChromeDriver();
	  //driver = new FirefoxDriver();*/
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setBrowserName("firefox");
	  try {
		driver = new RemoteWebDriver (new URL("http://192.168.0.126:4444/wd/hub"),capabilities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.manage().window().maximize();

  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
