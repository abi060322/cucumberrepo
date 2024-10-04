package org.pom;

import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinpojo5 extends Baseclass{
  public Adactinpojo5() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@value='T07WO0ZL7K']")
public WebElement orderno;

public WebElement getOrderno() {
	return orderno;
}



















}
