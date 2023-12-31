package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
//		driver.get("https://demoqa.com/frames");
/*		String frameText = driver.switchTo().frame("sampleHeading").getTitle();
		System.out.println(frameText);
		String frameText1 = driver.switchTo().frame(1).getTitle();
		System.out.println(frameText1);*/
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// Opens the Google page
		js.executeScript("window.location='https://google.com';");
		System.out.println(driver.findElement(By.xpath("//input[@class='gLFyf']")).getCssValue("background-color"));
		WebElement ele=driver.findElement(By.xpath("//input[@class='gLFyf']"));
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("alert('hi')");
		System.out.println(js.executeScript("window.innerWidth"));
		/*
		 * Alert ale= driver.switchTo().alert(); ale.accept();
		 */
	}

}
