package org.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import mvn.Base;

public class Adactin {
public static void main(String[] args) throws IOException {
	Base base = new Base();
	WebDriver driver = base.getDriver();
	base.loadurl(driver, "http://adactinhotelapp.com/");
	
	LoginPage loginPage = new LoginPage();
	base.typeKeys(loginPage.getTxtUserName(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,0) );
	base.typeKeys(loginPage.getTxtPassword(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,1) );
	base.btnClick(loginPage.getBtnlogin());
	
	SearchPage searchPage = new SearchPage();
	base.selectByValue(searchPage.getLocation(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,2));
	base.btnClick(searchPage.getBtnSearch());
	
	Selectpage selectpage = new Selectpage();
	
	base.btnClick(selectpage.getHotelclick());
	base.btnClick(selectpage.getBtncontinue());
	
	BookHotel bookHotel = new BookHotel();
	
	base.typeKeys(bookHotel.getFirstName(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,10));
	base.typeKeys(bookHotel.getLastName(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,11));
	base.typeKeys(bookHotel.getAddress(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,12));
	base.typeKeys(bookHotel.getCcNo(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,13));
	base.typeKeys(bookHotel.getCcType(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,14));
	base.typeKeys(bookHotel.getCcExpMonth(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,15));
	base.typeKeys(bookHotel.getCcExpYear(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,16));
	base.typeKeys(bookHotel.getCvv(),base.getDataFromExcel("E:\\java prog\\mvn\\excel sheet\\adactin.xlsx","Booking",1,17));
	base.btnClick(bookHotel.getBookNow());
	
}
}
