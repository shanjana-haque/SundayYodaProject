package bdd.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataSheet {

	public void readExcelData ( String filePath, String fileName, String SheetName) throws IOException {
		File file =    new File(filePath+"\\"+fileName);
		FileInputStream fileInput = new FileInputStream(file);
		Workbook workBook = new XSSFWorkbook(fileInput);
		Sheet workSheet = workBook.getSheet(SheetName);
		int rowcount = workSheet.getLastRowNum()-workSheet.getFirstRowNum();
		
		int i;
		int j;
		for (i=0; i<rowcount+1; i++){
			Row row = workSheet.getRow(i);
			for(j=0; j<row.getLastCellNum(); j++){
				System.out.print(row.getCell(j).getStringCellValue()+"|| ");
				
				
				
			}
			System.out.println();
			
		}
	}
	public static void main(String...strings) throws IOException{
		ExcelDataSheet obj = new ExcelDataSheet();
		String filePath = System.getProperty("user.dir")+"\\src\\test\\resource\\DataSheets";
		obj.readExcelData(filePath, "ExcelData.xlsx", "Sheet1");
	}
}
