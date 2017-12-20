package HRMS.MAVEN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Sample {
	WebDriver driver;
	
	
public void takescreenshot(String str) throws Exception {
	
	DateFormat df= new SimpleDateFormat("YYYY_MMM_dd hh_mm_ss");
	Date d=new Date();
	String time=df.format(d);
	System.out.println(time);
	
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File ("E:\\selenium\\selenium online\\MAVEN\\Screenshots\\"+str+time+".png"));
}
  @Test
  public void login() throws Exception {
	  
	  driver.findElement(By.xpath(".//input[@id='txtUsername'][@type='text']")).sendKeys("Admin");
	  driver.findElement(By.xpath(".//input[@id='txtPassword'][@type='password']")).sendKeys("admin");
	  driver.findElement(By.name("Submit")).click();
	  takescreenshot("login");
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\downloads\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
  }

  @AfterClass
  public void afterTest() throws Exception {
	  
	  driver.findElement(By.xpath(".//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a/img")).click();
	  driver.findElement(By.xpath(".//input[@id='assignleave_txtEmployee_empName'][@type='text']")).sendKeys("John");
	  driver.findElement(By.xpath(".//input[@id='assignleave_txtEmployee_empName'][@type='text']")).sendKeys(Keys.TAB);
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  new Select(driver.findElement(By.xpath(".//select[@id='assignleave_txtLeaveType']"))).selectByVisibleText("Vacation US");
	  Thread.sleep(3000);
	 
	  driver.findElement(By.linkText("view details")).click();
	  driver.findElement(By.xpath(".//*[@id='closeButton']")).click();
	  
	  driver.findElement(By.id("assignleave_txtFromDate")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("15")).click();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath(".//*[@id='assignleave_txtToDate']")).clear();
	  driver.findElement(By.xpath(".//*[@id='assignleave_txtToDate']")).sendKeys("2017-11-16");
	  driver.findElement(By.xpath(".//*[@id='assignleave_txtToDate']")).sendKeys(Keys.TAB);
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  
	  new Select(driver.findElement(By.xpath(".//*[@id='assignleave_partialDays']"))).selectByVisibleText("All Days");
	  Thread.sleep(3000);
	  new Select(driver.findElement(By.xpath(".//*[@id='assignleave_firstDuration_duration']"))).selectByVisibleText("Half Day");
	  
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(".//*[@id='assignBtn']")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath(".//input[@id='confirmOkButton'][@type='button']")).click();

	  takescreenshot("afterTest");
	  
  }
  
  @AfterTest
  public void logout (){
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath(".//*[@id='welcome']")).click();
	  driver.findElement(By.linkText("Logout")).click();
	
  }

}
