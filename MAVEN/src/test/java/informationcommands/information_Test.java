package informationcommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class information_Test {
	
	WebDriver driver;
	
  @Test
  public void fbinfo() {
	  
	  String str = driver.findElement(By.xpath(".//*[@id='email']")).getAttribute("class");
	  System.out.println(str);
	  String str1 = driver.findElement(By.id("pass")).getAttribute("type");
	  System.out.println(str1);
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	  //System.out.println(driver.getPageSource());
	  String str2 = driver.findElement(By.name("websubmit")).getText();
	  System.out.println(str2);
	  List<WebElement> str3 = new Select(driver.findElement(By.xpath(".//*[@id='day']"))).getOptions();
	  
	  System.out.println(str3.size());
	  for(int i = 0; i<str3.size(); i++) {
		  if (str3.get(i).getText() != null) {
			  System.out.println(str3.get(i).getText());
		  }
	  }
	  
  }
  @BeforeTest
  public void openurl() {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("http://www.fb.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
