package datadriventesting;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\testdata\\loginpage.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		String url = w1.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String un = w1.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String pwd = w1.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver f1= new FirefoxDriver();
		f1.get(url);
		f1.findElement(By.name("username")).sendKeys(un);//enter username
		f1.findElement(By.name("pwd")).sendKeys(pwd);//enter password
		f1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
	}

}
