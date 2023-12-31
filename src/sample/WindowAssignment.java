package sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowAssignment extends FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://the-internet.herokuapp.com");
		String keysOperation = Keys.chord(Keys.CONTROL, Keys.ENTER);
		findElement(driver, "//a[text()='Multiple Windows']").sendKeys(keysOperation);
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		String parentWindow = driver.getWindowHandle();

		// Sir I created findElement for Xpath in different Class
		while (itr.hasNext()) {
			String childWindow = itr.next();

			if (childWindow.equals(parentWindow)) {
				continue;
			}
			driver.switchTo().window(childWindow);
			// Title
			// System.out.println(driver.getTitle());
			String str1 = findElement(driver, "//*[text()='Opening a new window']").getText();
			System.out.println(str1);
		}
		driver.switchTo().window(parentWindow);
		// Title
		// System.out.println(driver.getTitle());
		String str2 = findElement(driver, "//*[text()='Welcome to the-internet']").getText();
		System.out.println(str2);
	}

}
