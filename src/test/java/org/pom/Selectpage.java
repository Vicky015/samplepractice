package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import mvn.Base;

public class Selectpage extends Base {
	public Selectpage() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id="radiobutton_1")
		private WebElement hotelclick;
	
	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getHotelclick() {
		return hotelclick;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	
}
