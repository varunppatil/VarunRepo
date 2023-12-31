package sample;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameandWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//Already existing site without internet
		driver.get("file:/C:/Users/HP/Desktop/o save file protocol of website - Google Search.html");
		
		driver.findElement(By.xpath("(//a)[8]")).sendKeys("uE035");
		//driver.get("https://amazon.com");
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		By dismiss = By.xpath("//input[@data-action-type='DISMISS']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(dismiss));
		//wait.until(ExpectedConditions.te)
		
		WebElement ele=driver.findElement(dismiss);
				ele.click();
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("VarunPatil");
		WebElement elementToMouseOver = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(elementToMouseOver).build().perform();
		action.contextClick(elementToMouseOver).build().perform();
		 Select s = new Select(ele);
		 
		 int [] arr= new int [] {1,2,3};
		 
		 ArrayList<Object[]> arr1 = new ArrayList<Object[]>();
		 arr1.add(new Object[]{"a","b","c"});
		
		 
	}

}
