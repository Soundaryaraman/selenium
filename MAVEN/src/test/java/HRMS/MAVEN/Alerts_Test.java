package HRMS.MAVEN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Alerts_Test {
	WebDriver driver;
	
  @Test(priority= 0)
  public void search() throws Exception {
	  
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	  driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[7]/a")).click();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[8]/a")).click();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.linkText("31")).click();
	  new Select (driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']"))).selectByVisibleText("9 Adults");
	  //new Select (driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Child']"))).selectByVisibleText("1 Child");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  new Select (driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_DropDownListCurrency']"))).selectByVisibleText("US Dollar(USD)");
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_btn_FindFlights']")).click();
	  Thread.sleep(10000);
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
  }
  
  @Test(priority=1)
  
  public void alert() throws Exception {
  
  String str;
  str = driver.switchTo().alert().getText();
  System.out.println(str);
  driver.switchTo().alert().accept();
  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  
  }
  
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.spicejet.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
