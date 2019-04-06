package scripts;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class NicheLoginTest {
	NicheLoginPO myLogin;
  @Test
  public void nicheLoginTest() {
	  myLogin.login("stc123", "12345"); 
	  
	  assertEquals(myLogin.getTitle(),"My account");
  }
  @BeforeMethod
  public void beforeMethod() {
	  myLogin = new NicheLoginPO();
	  myLogin.get();
  }

  @AfterMethod
  public void afterMethod() {
	  myLogin.close();
  }

}
