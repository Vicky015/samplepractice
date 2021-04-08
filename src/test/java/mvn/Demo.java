package mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;

public class Demo {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\java prog\\mvn\\excel sheet\\pra.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook w= new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet("data");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int type = cell.getCellType();
				if(type==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				if(type==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
				String name = new SimpleDateFormat("dd-MMM-yy").format(cell.getDateCellValue());
					System.out.println(name);
					}
				else {
					String name = String.valueOf((long)cell.getNumericCellValue());
					System.out.println(name);
				}
				}
				
			
	}

}}}
