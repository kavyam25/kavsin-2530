package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read {
	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("./Testdata/facebook.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sht=wb.getSheet("Sheet1");
		XSSFRow row= sht.getRow(1);
		XSSFCell cel = row.getCell(1);
		String val = cel.getStringCellValue();
		System.out.println(val);
		wb.close();
		file.close();		
		
	 	 
	 
	 
	 
	 
	 
	}
	

}
