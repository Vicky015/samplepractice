package mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	public static WebDriver driver ;
	
	public static WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver","E:\\java prog\\SELETASK\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
			
	}
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public static void loadurl(WebDriver driver,String url) {
		driver.get(url);
			
	}
	public static void typeKeys(WebElement element,String data) {
		element.sendKeys(data);
		
	}
	public void btnClick(WebElement element) {
		element.click();
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}
	public String geturl(WebDriver driver) {
		String Url = driver.getCurrentUrl();
		return Url;
	}
	
	public String getTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}
	
	public String getAtribute(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}
	
	public String getText(WebElement element) {
		String text = element.getText();
		return text;	
	}
	
	public void moveToElement(WebElement element,Actions actions) {
		actions.moveToElement(element).perform();
	}
	
	public void draganddrop(WebElement source,WebElement target,Actions actions) {
		actions.dragAndDrop(source, target).perform();
	}
	
	public void contextClick(WebElement element,Actions actions) {
		actions.contextClick(element).perform();
	}
	
	public void doubleClick(WebElement element,Actions actions) {
		actions.doubleClick(element).perform();
	}
	
	public void alertSwitch(WebDriver driver,Alert alert) {
		driver.switchTo().alert();

	}
	
	public void alertAccept(Alert alert) {
		alert.accept();
	}
	
	public void alertDismiss(Alert alert) {
		alert.dismiss();
	}
	
	public void selectByIndex(Select select,int data) {
		select.selectByIndex(data);
	}
	
	public void selectByValue(WebElement element,String data) {
		Select select = new Select(element);
		select.selectByValue(data);
	}
	public void selectByVisibleText(Select select,String data) {
		select.selectByVisibleText(data);
	}
	
	public static String getDataFromExcel(String pathname,String name,int rowNum,int cellNum) throws IOException {
		File file = new File(pathname);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(name);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		int cellType = cell.getCellType();
		
		String value = "";
		if (cellType == 1) {
			 value = cell.getStringCellValue();
		}
		else if (cellType == 0) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			value = dateFormat.format(dateCellValue);
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long l =(long)numericCellValue;
				value = String.valueOf(l);
			}
			return value;
		}
		public void createSheet(String location,String name,int rownum,int cellnum,String data) throws IOException {
			File file = new File(location);
			Workbook workbook = new XSSFWorkbook();
			Sheet sheet = workbook.createSheet(name);
			Row row = sheet.createRow(rownum);
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(data);
			
			FileOutputStream  fileOutputStream = new FileOutputStream(file);
			workbook.write(fileOutputStream);
			
		}
		
	
	
	
	
	
	public void scrollDown(JavascriptExecutor executor,WebElement element) {
		executor.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
