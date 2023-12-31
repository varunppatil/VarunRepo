package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptExecutorgetTextAndCHERCHER {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get(
				"https://www.softwaretestinghelp.com/selenium-find-element-by-text/#:~:text=Text%20%28%29%20Method%20of%20Selenium%201%20Open%20Firefox,displayed%2C%20print%20the%20text%20as%20Element%20not%20found.");
		
		//driver.findElement(By.cssSelector("tcb-icon")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele2= driver.findElement(By.id("Selenium_Find_Element_That_Contains_Specific_Text"));
		String val = "return document.getElementById(\"Selenium_Find_Element_That_Contains_Specific_Text\").value";
		
		String valueText = (String)js.executeScript(val);
		System.out.println(valueText);
		String text = (String) js.executeScript("return arguments[0].text;", ele2);
		
	// For creating alert
		js.executeScript("alert('hi')");
		
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert ale= driver.switchTo().alert();
		ale.accept();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\Documents\\varun.png");
		
		FileUtils.copyFile(src, dest);
		System.out.println(driver.getPageSource());
		String elementId = "element-id";
		//String html =(String) js.executeScript("return document.getElementById('" + elementId + "').innerHTML;");
		//System.out.println(html);
		//driver.navigate()
	By title = By.xpath("//title[text()='Selenium Find Element By Text Tutorial with Examples']");
		      System.out.println( "kaha hai be" + driver.findElement(title).getCssValue("font-size")+
		        driver.findElement(title).getCssValue("font-colour")+
		        driver.findElement(title).getCssValue("font-type")+
		        driver.findElement(title).getCssValue("background-colour"));
		      driver.findElement(title).click();
		      driver.findElement(title).sendKeys(Keys.F5);
		      
		      Actions action = new Actions(driver);
		   
	}

}
