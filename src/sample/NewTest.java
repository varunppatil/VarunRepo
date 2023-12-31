package sample;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class NewTest {
	public String Url="http://accounts.google.com/signin";
	public WebDriver driver;

 
@Test
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
			 driver=new ChromeDriver();
			 }
@Test(priority=1)
  public void varun() {
	driver.get(Url);
	  String exptTitle="Sign in – Google accounts";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle,exptTitle);
  }
 @Test
  public void afterMethod() {
	  driver.quit();
  }

}
