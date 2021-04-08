package mvn;

import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mvvn {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\java prog\\SELE\\drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("http://demo.automationtesting.in/Register.html");

	WebElement countries = driver.findElement(By.id("countries"));
	countries.click();

	Select select = new Select(countries);
	List<WebElement> options = select.getOptions();
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("data");
	for (int i = 0; i < options.size(); i++) {
		WebElement element = options.get(i);

		String text = element.getText();
		// System.out.println(text);

		Row r = s.createRow(i);
		Cell cell = r.createCell(0);
		cell.setCellValue(text);
	}
		FileOutputStream fileOutputStream = new FileOutputStream(
				new File("E:\\java prog\\mvn\\excel sheet\\New Microsoft Excel Worksheet.xlsx"));
		w.write(fileOutputStream);
		System.out.println("Done");
		driver.close();



}
}
