package Actions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Action_Test {
	
	WebDriver driver;
	
	@Test
  public void actions() throws Exception {
  
		Actions s = new Actions(driver);
		s.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
		driver.findElement(By.linkText("Careers")).click();
		Thread.sleep(3000);
		s.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(3000);
		s.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
	}
	 
@BeforeTest
   public void browserlaunch() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.spicejet.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	
	    }

  @AfterTest
  public void afterTest() {
  }

}
