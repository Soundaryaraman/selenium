package informationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Validation_Test {
	
	WebDriver driver;
	
  @Test
  public void validate() {
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  boolean str = driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_txt_Todate']")).isDisplayed();
	  
	  if (str) {
		  System.out.println("to date available");
	  }
	  
	  else {
		  System.out.println("to date not available");
		  
	  }
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
  boolean str1 = driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected();
     if (str1) {
    	 System.out.println("Friends and family selected");
     }
     else {
    	 System.out.println("friends and family not selected");
    	 }
  
  }
  @BeforeTest
  public void open() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.spicejet.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
