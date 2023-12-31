package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Test.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();
		XSSFCell colno = sheet.getRow(0).getCell(0);
		System.out.println(colno);
		XSSFCell colChange = sheet.getRow(0).getCell(0);
		colChange.setCellValue("COLLEGE CODE");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\Test.xlsx");
		wb.write(fos);
		fos.close();
		
		System.out.println(colno);
		
		Iterator<Row> firstrow = sheet.iterator();
		
//		Iterator<Cell> cellno= firstrow.celliterator();
		
		
		}
	public static WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			return driver;
	}
	public static WebElement findElement(WebDriver driver, String Path) {
		String xpathValue=Path;

		WebElement ele = driver.findElement(By.xpath(xpathValue));
		return ele;
	}

}
