package mvn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin extends Base {

	public static void main(String[] args) throws IOException, InterruptedException  {
		
		
		Base base = new Base();
		WebDriver driver = base.getDriver();
	//	base.maximize(driver);

		base.loadurl( driver,"http://adactinhotelapp.com/");
		
		
		WebElement txtusername = driver.findElement(By.id("username"));
		base.typeKeys(txtusername,base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,0));
		
		
		WebElement txtpass = driver.findElement(By.id("password"));
		base.typeKeys(txtpass, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,1));
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		base.btnClick(btnlogin);
		
		Thread.sleep(2000);
		
		WebElement txtlocation = driver.findElement(By.id("location"));
		base.typeKeys(txtlocation, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,2));
		
		WebElement txthotel = driver.findElement(By.id("hotels"));
		base.typeKeys(txthotel, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,3));
		
		WebElement txtroomType = driver.findElement(By.id("room_type"));
		base.typeKeys(txtroomType, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,4));
		
		WebElement txtRoomno = driver.findElement(By.id("room_nos"));
		base.typeKeys(txtRoomno, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,5));
		
		WebElement txtdcin = driver.findElement(By.id("datepick_in"));
		base.typeKeys(txtdcin, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,6));
		
		WebElement txtdcout = driver.findElement(By.id("datepick_out"));
		base.typeKeys(txtdcout, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,7));
		
		WebElement txtadult = driver.findElement(By.id("adult_room"));
		base.typeKeys(txtadult , base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,8));
		
		WebElement txtchlid = driver.findElement(By.id("child_room"));
		base.typeKeys(txtchlid, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,9));
		
		WebElement btnsearch = driver.findElement(By.id("Submit"));
		base.btnClick(btnsearch);
		
		Thread.sleep(2000); 
		
		WebElement btnselect = driver.findElement(By.id("radiobutton_0"));
		base.btnClick(btnselect);
	
		WebElement btncontinue = driver.findElement(By.id("continue"));
		base.btnClick(btncontinue);
		
		Thread.sleep(2000);
		
		WebElement txtfirstname = driver.findElement(By.id("first_name"));
		base.typeKeys(txtfirstname, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,10));
		
		WebElement txtlastname = driver.findElement(By.id("last_name"));
		base.typeKeys(txtlastname, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,11));
		
		WebElement txtaddress = driver.findElement(By.id("address"));
		base.typeKeys(txtaddress, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,12));
		
		WebElement txtCardNo = driver.findElement(By.id("cc_num"));
		base.typeKeys(txtCardNo, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,13));
		
		WebElement txtCardType = driver.findElement(By.id("cc_type"));
		base.typeKeys(txtCardType, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,14));
		
		WebElement txtExpMonth = driver.findElement(By.id("cc_exp_month"));
		base.typeKeys(txtExpMonth, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,15));
		
		WebElement txtExpYear = driver.findElement(By.id("cc_exp_year"));
		base.typeKeys(txtExpYear, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,16));
		
		WebElement txtCvvNo = driver.findElement(By.id("cc_cvv"));
		base.typeKeys(txtCvvNo, base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,17));
		
		WebElement btnbooknow = driver.findElement(By.id("book_now"));
		base.btnClick(btnbooknow);
		
		Thread.sleep(8000);
		
		WebElement orderno = driver.findElement(By.xpath("//input[@id='order_no']"));
		String text = orderno.getAttribute("value");
		
		base.createSheet("E:\\java prog\\mvn\\excel sheet\\adactinout.xlsx","Booking",0,0,text);
	//	System.out.println(text);
		System.out.println("done");
						
		base.closeBrowser(driver);
	}

}
