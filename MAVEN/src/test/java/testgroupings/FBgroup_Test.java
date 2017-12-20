package testgroupings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class FBgroup_Test {
	
	WebDriver driver;
	
  @Test(priority=0,groups="regression")
  public void fbopen() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("http://www.fb.com/");
	  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sowmya@gmail.com");
	  driver.findElement(By.name("pass")).sendKeys("123456789");
	  driver.findElement(By.xpath(".//*[@type='submit'][@value='Log In']")).click();
	  Thread.sleep(5000);
	  
  }
   
  @Test(priority=1,groups="sanity")
  public void create() throws Exception{
	  driver.findElement(By.linkText("Sign Up")).click();
	  //driver.findElement(By.xpath(".//*[@id='u_0_h'][@name='firstname']")).sendKeys("inetsolv");
	  //driver.findElement(By.name("websubmit")).click();
      Thread.sleep(5000);
  }
  
  @Test(priority=2,groups="regression")
  public void messenger() {
	    driver.findElement(By.linkText("Messenger")).click();
	  //driver.findElement(By.xpath(".//*[@id='js_0']/ul/li[3]/a")).click();
  }

}
