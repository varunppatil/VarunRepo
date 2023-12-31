package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteCookiesAndMAximize {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().deleteAllCookies();

		// If u want to delete cookie and redirect it to login page
		driver.manage().deleteCookieNamed("Specific");
		{
			driver.get("https://google.com");
		}

	}

}
