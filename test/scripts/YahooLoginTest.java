package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import static org.testng.Assert.assertEquals;
public class YahooLoginTest {
  YahooLoginPO myYahooLogin;
	@Test
  public void YahooLogin() throws InterruptedException {
		myYahooLogin.login("grace.yemmi2013@yahoo.com", "Reditio2019");
		assertEquals(myYahooLogin.getTitle(),"Yahoo");
  }
  @BeforeMethod
  public void beforeMethod() {
	  myYahooLogin = new YahooLoginPO();
	  myYahooLogin.get();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //myYahooLogin.close();
  }

}
