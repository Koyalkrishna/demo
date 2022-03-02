package com.crm.autodesk.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * its developed using Apache poi libraries,which used to handle microsoft Excel sheet
 * @author USER
 *
 */
public class ExcelUtility {
	/**
	 * its used read the data from excel base don below arguments
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @param Data
	 * @param Throwable
	 * @throws Throwable 
	 */
	public String getDataFromExcel(String sheetName , int rowNum, int celNum) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(celNum).getStringCellValue();
		wb.close();
		return data;
	}
		/**
		 * used to get the last used row number on specified sheet
		 * @param sheetName
		 * @return
		 */
	
		

			
				
	
}
