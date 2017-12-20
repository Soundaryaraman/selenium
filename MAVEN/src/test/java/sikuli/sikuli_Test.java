package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.api.Screen;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class sikuli_Test {
	
	WebDriver driver;
  
 @Test
  public void f() {
	 
	
	
	 
 
 
 }
  @BeforeTest
  public void beforeTest() {
 
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.seleniumhq.org/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
