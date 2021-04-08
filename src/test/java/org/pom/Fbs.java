package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import mvn.Base;

public class Fbs extends Base {
	public Fbs() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBys({
		@FindBy(id="username"),
		@FindBy(xpath="//input[@class='login_input']")
	})
	private WebElement txtUserName;
	
	@CacheLookup
	@FindBys({
		@FindBy(id="password"),
		@FindBy(xpath="//input[@name='password']")
	})
	private List<WebElement> txtpassword;

	@CacheLookup
	@FindBys({
		@FindBy(id = "login"),
		@FindBy(xpath="//input[@class='login_button']")
	})
	private List<WebElement> btnlogin;

	
	
	public List<WebElement> getBtnlogin() {
		return btnlogin;
	}

	public List<WebElement> getTxtpassword() {
		return txtpassword;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}
	
	

}
