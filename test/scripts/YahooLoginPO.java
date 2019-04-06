package scripts;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class YahooLoginPO extends LoadableComponent<YahooLoginPO>{
	
	
	@FindBy (id = "uh-signin")
	private WebElement signin;
	
	@FindBy (id ="login-username")
	private WebElement username;
	
	@FindBy (name ="password")
	private WebElement passwd;
	
	@FindBy(name ="signin")
	private WebElement firstnext;
	
	@FindBy (name= "verifyPassword")
	private WebElement verifypass;
	
	private WebDriver driver;
	
	private String expectedTitle = "Yahoo";
	
	@FindBy(tagName = "a")
	private List<WebElement> allTags;
	
	public YahooLoginPO(){
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Training_Grace\\webdrivertraining\\test\\resources\\chromedriver-32bit.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public void login(String user,String pass) throws InterruptedException {
		
		signin.click();
		username.clear();
		username.sendKeys(user);
		firstnext.click();
	  Thread.sleep(3000);
		passwd.sendKeys(pass);
		//Thread.sleep(3000);
		verifypass.click();
		
		
	}
 public String getTitle() {
	 return driver.getTitle();
 }
 
 public void close() {
	 //driver.quit();
 }
	
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		driver.get("https://www.yahoo.com");

	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		assertEquals(driver.getTitle(),expectedTitle);
	}
	
	

	
}
