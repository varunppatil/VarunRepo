package sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling extends FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		
		String parentWindow = driver.getWindowHandle();
		
		while(itr.hasNext()) {
			String childWindow = itr.next();
			
			if(childWindow.equals(parentWindow)) {
				continue;
			}
			driver.switchTo().window(childWindow);
			System.out.println(driver.getTitle());
			findElement(driver,"//div[@class='navbar-collapse collapse clearfix']/ul/li[2]").click();
			
		}
		driver.switchTo().window(parentWindow);
		System.out.print(driver.getTitle());
		
	}

}
