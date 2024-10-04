package org.pom;

import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinpojo3 extends Baseclass {

	public Adactinpojo3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='radio']")
	public WebElement select;

	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement conti;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getConti() {
		return conti;
	}

	
	
	
	
	
	
	
	
	
}
