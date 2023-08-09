package shopstack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtilities {

	public String dataFromExcel(String filepath, String sheetName,int rowNumber,int columnNumber) throws EncryptedDocumentException, IOException {
		File file = new File(filepath);
		FileInputStream fileInput = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fileInput);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.getCell(columnNumber);
		String value =cell.getStringCellValue();
		return value;
}
	
	public String dataFromPropertiesFile(String filepath, String key) throws IOException {
		File file = new File(filepath);
		FileInputStream fileInput = new FileInputStream(file); 
		Properties pro=new Properties();
		pro.load(fileInput); 
		String value = pro.getProperty(key); 
		return value;
}	

}
