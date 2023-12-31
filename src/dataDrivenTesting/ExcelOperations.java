package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/*public class ExcelOperations {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deleteFiles("Data");
/*		modifyExceFiles1("Data.xls","Varun",0,0);
	}

	private static void modifyExcelFiles(String string, String string2, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	static void deleteFiles(String name) {
		File file = new File("C:\\Users\\HP\\Desktop");
		String [] currentFiles;
		// if(file.isDirectory())
		{
			currentFiles = file.list();
			for(int i=0; i < currentFiles.length; i++) {
				File myFile = new File(file, currentFiles[i]);
				if(myFile.getName().contains(name)) {
					myFile.delete();
					System.out.println("File deleted "+myFile);
				}
			}
		}
	}
		
/*	public static void modifyExceFiles1(String fileName, String cellValue, int rowNumber, int cellNumber) {
		String filePath = "C:\\Users\\HP\\Desktop";
		System.out.println(filePath);
		
		File file = new File(filePath);
		if (file.exists()) {
			try
			{
				FileInputStream fis = new FileInputStream(file);
				Workbook wb = null;
				String fileExtensionName = fileName.substring(fileName.indexOf(".")+1);
				if(fileExtensionName.equals("xlsx")) {
					wb = XSSFWorkBook(fis);
				}
				else if (fileExtensionName.equals("xls")) {
					wb = HSSFWorkBook(fis);
				}
				Sheet sheet = wb.getSheetAt(0);
				sheet.getRow(rowNumber).getCell(cellNumber).setCellValue(cellValue);
				fis.close();
				FileOutputStream fos=new FileOutputStream(file);
				wb.write(fos);
				fos.close();
				}
			catch (Exception e) {
				System.out.println(e.getMessage());
				throw new Exception("Unable to modify excel file "+e.getMessage());
		
			}
			
			public static void copyFile(String fileName, String cellValue, int rowNumber, int cellNumber) {
				String filePath = "C:\\Users\\HP\\Desktop";
				System.out.println(filePath);
				
				File file = new File(filePath);
				if (file.exists()) {
					try
					{
						FileInputStream fis = new FileInputStream(file);
						Workbook wb = null;
						String fileExtensionName = fileName.substring(fileName.indexOf(".")+1);
						if(fileExtensionName.equals("xlsx")) {
							wbinput = XSSFWorkBook(fis);
							wboutput=XSSFWorkBook();
						}
						else if (fileExtensionName.equals("xls")) {
							wbinput = HSSFWorkBook(fis);
							wboutput= HSSFWorkBook();
						}
						wboutput=wbinput;
						FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Documents"+"files\\");
						System.out.println("File copied at: " +"C:\\Users\\HP\\Documents"+"files\\");
						wb.write(fos);
						fos.close();
						}
					catch (Exception e) {
						System.out.println(e.getMessage());
						throw new Exception("Unable to copy excel file "+e.getMessage());
					}
					else {
						System.out.println("File to copy doesn't exist ");
						throw new Exception("File to copy doesn't exist ");
					}
					}
	}
	
	
}
*/

