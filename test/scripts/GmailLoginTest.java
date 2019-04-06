package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static org.testng.Assert.assertEquals;



public class GmailLoginTest {
GmailLoginPO myLogin;	

  @Test
  public void gmailLoginTest() throws InterruptedException {
	  myLogin.login("sheetal.grace2013@gmail.com" ,"1234");
	  assertEquals(myLogin.getTitle(),"Gmail");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  myLogin = new GmailLoginPO();
	  myLogin.get();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //myLogin.close();
  }

}
