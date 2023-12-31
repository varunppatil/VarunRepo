package sample;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class RahulShetty extends FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		try {
			driver.get("http://rahulshettyacademy.com/AutomationPractice/");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// Assertion
//		Assert.assertThrows(null);

		// As per conditions for element who change so keep eye on DOM for isSelected
		// etc method
//		driver.findElement(By.id("q")).getAttribute("q").contains("1");
		driver.findElement(By.id("name")).sendKeys("Varun");
		WebElement ele = driver.findElement(By.id("alertbtn"));
		ele.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement el2 = driver.findElement(By.id("confirmbtn"));
		el2.click();
		Alert al = driver.switchTo().alert();
		String str = al.getText();
		System.out.println(str);
		driver.switchTo().alert().dismiss();

	}
}
