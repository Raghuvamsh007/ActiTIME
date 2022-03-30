package datadriventesting;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\testdata\\userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		Sheet s1 = w1.getSheet("sheet2");
		Row r1 = s1.createRow(3);
		Cell c1 = r1.createCell(1);
		c1.setCellValue("java");
		FileOutputStream fos = new FileOutputStream("D:\\testdata\\userdata.xlsx");
		w1.write(fos);
		System.out.println("execution is over");
		
		
	
	}

}
