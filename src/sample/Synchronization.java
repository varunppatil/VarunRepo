package sample;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Documents\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
//#1.		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
//#2		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frameName"));

		
		
    //Implicit Wait:		
    // If we are giving 5 sec  then its maximum time to find element but 
    //if we find before eg in 3 sec then it will click on it
    //but everytime in failure case also it will 5sec which will increase time
		String [] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT']")).click();
//		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacadmy");
		
			
	}
	
	public static void addItems(WebDriver driver, String [] itemsNeeded) {
		
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		for(int i=0; i<products.size();i++) {			
			String name = products.get(i).getText();
			
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			String name1 = name.split("-")[0].trim();	
	if(itemsNeededList.contains(name1.trim())) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button]")).get(i).click();
				if(j==3) {
					break;
				}
			}
		}
	}

}
