package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import mvn.Base;

public class SearchHotfindbys extends Base {
	public SearchHotfindbys() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({
		@FindBy(id="location"),
		@FindBy(xpath="//select[@name='location']")
	})
	private List<WebElement> hotelLocation;

	@FindBys({
		@FindBy(id="hotels"),
		@FindBy(xpath="//select[@name='hotels']")
	})
	private List<WebElement> hotel;
	
	
	@FindAll({
		@FindBy(id="room_type"),
		@FindBy(id="room_")
		//	@FindBy(xpath="(//select[@class='search_combobox'])[3]")
	})
	private List<WebElement> roomType;
	
	
	
	public List<WebElement> getRoomType() {
		return roomType;
	}



	public List<WebElement> getHotel() {
		return hotel;
	}



	public List<WebElement> getHotelLocation() {
		return hotelLocation;
	}
	

}
