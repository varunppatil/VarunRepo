package sample;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		driver.findElement(with(By.tagName("input")).below(nameEditBox)).sendKeys("VArun");
		
		//System.out.println(s);
		WebElement dropdown= driver.findElement(By.id("exampleFormControlSelect1"));
		driver.findElement(with(By.tagName("input")).below(dropdown)).click();
		System.out.println(dropdown.getRect().getDimension().getHeight());
		System.out.println(dropdown.getRect().getDimension().getWidth());
		/*
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * driver.get("https://google.com");
		 */
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https;//RohitSonawane.com");
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String> itr= s.iterator();
		
		
		
		
		
	}

}
