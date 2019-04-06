package scripts.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGConfig1 {
  @Test
  public void test1() {
	  System.out.println("inside test1 of TESTNGConfig1 ");
  }
  @Test
  public void test2() {
	  System.out.println("inside test2 of TESTNGConfig1 ");
  }
 
  @Test
  public void test3() {
	  System.out.println("inside test3 of TESTNGConfig1");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("inside beforeMethod of TESTNGConfig1 ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("inside afterMethod of TESTNGConfig1");
  }
  
//Ending od 3 tests with theirrespective after and before method
  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("inside beforeClass of TESTNGConfig1 ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("inside afterClass of TESTNGConfig1 ");
  }
//After and before test
  @BeforeTest
  public void beforeTest() {
	  System.out.println("inside beforeTest of TESTNGConfig1 ");
  }
//in java file 
  @AfterTest
  public void afterTest() {
	  System.out.println("inside afterTest of TESTNGConfig1 ");
  }
//After and before suite
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("inside beforeSuite of TESTNGConfig1 ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("inside afterSuite of TESTNGConfig1 ");
  }

}
