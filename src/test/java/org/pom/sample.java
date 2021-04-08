package org.pom;

import mvn.Base;

public class sample extends Base {
	
	public static void main(String[] args) {
		Base base = new Base();
		getDriver();
		loadurl(driver, "http://adactinhotelapp.com/");
		Fbs fbs = new Fbs();
		
		typeKeys(fbs.getTxtUserName(),"scofield");
		typeKeys(fbs.getTxtpassword().get(0),"prisonbreak");
		base.btnClick(fbs.getBtnlogin().get(0));
		
		SearchHotfindbys shf = new SearchHotfindbys();
		base.selectByValue(shf.getHotelLocation().get(0), "New York");
		base.selectByValue(shf.getHotel().get(0),"Hotel Creek");
		base.selectByValue(shf.getRoomType().get(0),"Super Deluxe");
		
	}

}
