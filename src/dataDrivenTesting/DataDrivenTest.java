package dataDrivenTesting;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest{
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5) );
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="loginPage")
	public void loginPage(String user, String pwd, String result) {
		System.out.println(user+pwd+result);
	}
	
	
	@DataProvider(name="loginPage")
	public String [][] getData(){
		String [][] data = {{"admin@yourstore.com","admin","valid"}
		              ,{"admin@yourstore.com","adm","invalid"}
		              ,{"adm@yourstore.com","admin","invalid"}
		              ,{"adm@yourstore.com","adm","invalid"}};
		return data;
	}
	@AfterClass
	public void close() {
		driver.quit();
	}
	
	
}