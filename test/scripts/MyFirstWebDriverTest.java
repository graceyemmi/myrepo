package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstWebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
System.setProperty("webdriver.gecko.driver","test\\resources\\geckodriver -64bit.exe");
driver = new ChromeDriver();
driver = new FirefoxDriver();
driver.manage().window().maximize();
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

driver.quit();
	}

}
