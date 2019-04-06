
package scripts;

//import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NinthAssignment {
	WebDriver driver;	
	@Test
	public void OptionSelection() throws InterruptedException {
		driver.findElement(By.id("dropdown")).click();
		WebElement optionSelection = driver.findElement(By.id("dropdown"));
		Select option = new Select(optionSelection);
		option.selectByIndex(2);
		
		
		
		
		
	}




	@BeforeMethod
	  public void BeforeMethod() throws InterruptedException{
	  
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
	  driver = new ChromeDriver();
	  driver.get("http://the-internet.herokuapp.com/dropdown");
	  Thread.sleep(5000);
	  //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	  //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	  //driver.manage().window().maximize();
	  
}

@AfterMethod
public void afterMethod() {
  //driver.quit();
}

}


