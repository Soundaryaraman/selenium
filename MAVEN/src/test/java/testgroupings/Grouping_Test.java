package testgroupings;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Grouping_Test {
  @Test(priority=0,groups = "this is group 1")
  public void A() {
	  System.out.println("good morning");
  }
  
  @Test(priority=2,groups = "this is group 2")
  public void B() {
	  System.out.println("Have a ");

  }
  
  @Test(priority=1,groups = "this is group 1")
  public void C() {
	  System.out.println("Nice Day");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("hey..");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("...");
  }

}
