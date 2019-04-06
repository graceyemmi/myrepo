package scripts;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class DataEntryTest {
	WebDriver driver;
  @Test
  public void DataEntry() throws InterruptedException {
	  driver.get("http://toolsqa.com/automation-practice-form/");
	  WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
	  firstName.sendKeys("Grace");
	  WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
	  lastName.sendKeys("Yemmi");
	 String firstname = firstName.getAttribute("value");
	 System.out.println("FirstName is " +firstname);
	 String lastname = lastName.getAttribute("value");
	 System.out.println("lastname is " +lastname);
	 Thread.sleep(3000);
	 driver.findElement(By.id("sex-1")).click();
	 driver.findElement(By.id("exp-6")).click();
	 driver.findElement(By.id("datepicker")).sendKeys("13 March 2019");
	 driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
	 driver.findElement(By.id("tool-2")).click();
	 
	 WebElement regions = driver.findElement(By.id("continents"));
	 Select dropDown =   new Select(regions);
	 dropDown.selectByVisibleText("North America");
	// dropDown.selectByIndex(1);
	 Thread.sleep(3000);
	 WebElement multiSelection = driver.findElement(By.tagName("selenium commands"));
	 Thread.sleep(3000);
	Select options =new Select(multiSelection);
	 options.selectByIndex(1);
	 options.selectByVisibleText("Wait Commands");
	 options.selectByVisibleText("Navigation Commands");
	 assertEquals(options.getAllSelectedOptions().size(),3);
	 List<String> expected = new ArrayList();
	 List<String> actual = new ArrayList();
	 expected.add("Wait Commands");
	 expected.add("Navigation Commands");
	 expected.add("Switch Commands");
	 Thread.sleep(3000);
	 for (WebElement select :options.getAllSelectedOptions()) {
	 		 actual.add(select.getText());
	 	 	 }
	 assertEquals(actual,expected);
	 options.deselectByVisibleText("Navigation Commands");
	 Thread.sleep(3000);
	 
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
