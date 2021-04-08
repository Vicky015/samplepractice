package mvn;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom extends Base {
	
	public static void main(String[] args) throws IOException {

		Base base = new Base();
		WebDriver driver = getDriver();
		base.loadurl(driver, "http://adactinhotelapp.com/");
		
		LoginPage loginPage = new LoginPage();
	//	WebElement txtUserName = loginPage.getTxtUserName();
	//	typeKeys(txtUserName,"scofield");
		base.typeKeys(loginPage.getTxtUserName(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,0));;
		base.typeKeys(loginPage.getTxtPassword(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,1));;
		base.btnClick(loginPage.getBtnLogin());
	
	
	
	} 

}
