package sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLChrome {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		ChromeOptions options = new ChromeOptions();
		driver.get("https://google.com");
		//For Insecure site certificate
		options.setAcceptInsecureCerts(true);
//      options.addExtensions(new File("C:\\Users"));
		
		//For Blocking popup
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		// Setting a proxy
		Proxy p = new Proxy();
		p.setHttpProxy("ipaddress:8080");
		options.setCapability("proxy",p);
		
		//Download location
		Map<String,Object> dwnld=new HashMap<String,Object>();
		dwnld.put("download.default_directory","/directory/path");
		options.setExperimentalOption("dwnld", dwnld);
		
		
		
		driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}
}
