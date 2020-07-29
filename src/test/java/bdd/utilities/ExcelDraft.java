package bdd.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDraft {

public static Map<String, Map<String, String>> setMapData() throws IOException {
		
		
		String path = "C:/Users/12404/workspace/SundayYodaProject/src/test/resource/DataSheets/ExcelDraftSheet.xlsx"; //path of excel file
		FileInputStream fileins = new FileInputStream(path); //where to get the file
		Workbook workbook = new XSSFWorkbook(fileins); //where the excel data will come up and save as workbook
		Sheet sheet = workbook.getSheetAt(0);  // in case of multiple sheets on excel; using sheet from apache.poi
		int lastrow = sheet.getLastRowNum()-sheet.getFirstRowNum(); //row count, getting the row number
		
		Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();  //first hashmap
		Map<String, String> dataMap = new HashMap<String, String>();  //second hashmap
		
		int i;
		int j;
		for (i=0; i<=lastrow+1; i++){  //starting loop
			Row row = sheet.getRow(i); // getting the row
			for(j=0; j<row.getLastCellNum(); j++){
			
			//start looping one by one
			Cell valueCell = row.getCell(0);
			Cell keyCell = row.getCell(1);
			
			//get and trim the value
			String value = valueCell.getStringCellValue().trim();
			String key = keyCell.getStringCellValue().trim();
			
			dataMap.put(key, value); //putting key and value in datamap, all data im gettin from excel and saving it to hashmap
			excelFileMap.put("DataSheet", dataMap); //putting datamap to excelfilemap, 
			
		}
			
	}
		return excelFileMap;
}
	
	public static String getMapData(String key) throws IOException {
		//set how to get the value
		Map<String, String> map = setMapData().get("DataSheet"); //call setmap data and do get, call datasheet from get.
		
		String value = map.get(key); // pressing parameter as key so that when called from other places it can still call the key
		
		return value;
		
	}
}


