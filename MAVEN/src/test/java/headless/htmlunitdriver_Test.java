package headless;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class htmlunitdriver_Test {

	WebDriver driver;
	
	@Test
  public void f() throws Exception {
		
		//driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("sowmya@gmail.com");
		
		driver.findElement(By.name("identifier")).sendKeys("sowmya@gmail.com");
		
		//for fb.com
		//driver.findElement(By.id("email")).sendKeys("sowmya@gmail.com");
		
		System.out.println("login inserted");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\downloads\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("window-size=1400,800");
	  options.addArguments("headless");
	  driver = new ChromeDriver(options);
	  
	  driver.get("http://www.gmail.com");
	  
	  //driver.get("http://www.fb.com");
	  
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
