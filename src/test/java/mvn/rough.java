package mvn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rough extends Base {

	public static void main(String[] args) throws IOException {
		
		
		Base  base = new  Base();
	//	WebDriver driver = base.getDriver();
	//	base.maximize(driver);
	//	base.loadurl(driver,"https://www.facebook.com/");
	//
	//	WebElement user = driver.findElement(By.id("email"));
	//	base.typeKeys(user,base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,0));
		
	//	WebElement pass = driver.findElement(By.id("pass"));
	//	base.typeKeys(pass,base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,0));
		base.createSheet("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",4,4,"java");
		
		
		
		
		
		
	//	base.closeBrowser(driver);
		
	}

}
