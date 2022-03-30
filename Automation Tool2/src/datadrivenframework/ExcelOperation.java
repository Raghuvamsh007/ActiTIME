package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation 
{
	public static String readData(String sheetname,int rownumber,int cellnumber) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\testdata\\userdata.xlsx");
		try
		{
			Workbook w1 = WorkbookFactory.create(fis);
			String data=w1.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).getStringCellValue();
		return data;
		}
		catch(Exception rv1)
		{
			return "";
		}
	}
	public static void writeData(String sheetname,int rownumber,int cellnumber,String data) throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("D:\\testdata\\userdata.xlsx");
		try
		{
			Workbook w1 = WorkbookFactory.create(fis);
			w1.getSheet(sheetname).getRow(rownumber).createCell(cellnumber).setCellValue(data);
			FileOutputStream fos = new FileOutputStream("D:\\testdata\\userdata.xlsx");
			w1.write(fos);
		}
		catch(Exception rv1)
		{
			System.out.println("error message");
		}
	}
	

}
