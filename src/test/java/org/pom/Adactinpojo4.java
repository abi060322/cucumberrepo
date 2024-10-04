package org.pom;

import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Adactinpojo4 extends Baseclass {

	public Adactinpojo4() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	public WebElement firname;
	
	

	@FindBy(id="last_name")
	public WebElement lasname;
	
	@FindBy(name="address")
	public WebElement address;
	
	@FindBy(id="cc_num")
	public WebElement cardno;
	
	@FindBy(id="cc_type")
	public WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	public WebElement month;
	
	@FindBy(id="cc_exp_year")
    public WebElement year;
	
	@FindBy(id="cc_cvv")
	public WebElement cvvno;
	
	@FindBy(id="book_now")
	public WebElement booknow;
	
	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getFirname() {
		return firname;
	}

	public WebElement getLasname() {
		return lasname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvno() {
		return cvvno;
	}
	
	
	
	
	
	
	
	
}
