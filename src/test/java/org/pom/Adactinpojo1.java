package org.pom;

import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinpojo1 extends Baseclass{
	
	public Adactinpojo1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	public WebElement name;


	@FindBy(id="password")
	public WebElement password;
	

	@FindBy(xpath="//input[@type='Submit']")
	public WebElement login;

	public WebElement getName() {
		return name;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}























}
