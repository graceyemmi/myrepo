package scripts;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginPO extends LoadableComponent<GmailLoginPO> {
	
@FindBy (id = "identifierId")
@CacheLookup
private WebElement username;

@FindBy (name = "password")
private WebElement userpass;

@FindBy (id ="passwordNext")
private WebElement loginButton;

@FindBy (tagName = "a")
private List<WebElement> allTags;

private WebDriver driver;
private Object expectedTitle = "Gmail" ;

//beforeMethod
public GmailLoginPO(){
	
	System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
	driver = new ChromeDriver();
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
public void login(String user,String pass) throws InterruptedException{
	username.clear();
	username.sendKeys(user);
	Thread.sleep(3000);
	//WebElement wait;
	//wait= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierNext\"]/content/span")));

    WebElement next = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
	next.click();
	Thread.sleep(3000);
	
	username.sendKeys(pass);
	Thread.sleep(3000);
	
	loginButton.click();
	Thread.sleep(3000);
}


//getTitle Method
public String getTitle() {
	return driver.getTitle();
}

//afterMethod
public void close() {
	driver.quit();
	}

@Override 
protected void load() {
	driver.get("http://www.gmail.com");
}
@Override
protected void isLoaded() {
	assertEquals(driver.getTitle(),expectedTitle);
}
}











	
	


