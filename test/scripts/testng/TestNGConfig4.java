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

public class TestNGConfig4 {
	@Test
	  public void test1() {
		  System.out.println("inside test1 of TestNGconfig4");
	  }
	  @Test
	  public void test2() {
		  System.out.println("inside test2 of TestNGconfig4");
	  }
	  @Test
	  public void test3() {
		  System.out.println("inside test3 of TestNGconfig4");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("inside beforeMethod of TestNGconfig4");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("inside afterMethod of TestNGconfig4");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("inside beforeClass of TestNGconfig4");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("inside afterClass of TestNGconfig4");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("inside beforeTest of TestNGconfig4");
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("inside afterTest of TestNGconfig4");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("inside beforeSuite of TestNGconfig4");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("inside afterSuite of TestNGconfig4");
		  
	  }

	}
