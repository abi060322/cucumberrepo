package org.pom;

import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo2 extends Baseclass{

	public AdactinPojo2() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="location")
	public WebElement loction;
	
	

	@FindBy(id="hotels")
	public WebElement hotels;
	
	@FindBy(id="room_type")
	public WebElement roomtype;
	
	@FindBy(id="room_nos")
	public WebElement roomnos;
	
	@FindBy(id="adult_room")
	public WebElement adultperroom;
	
	@FindBy(id="Submit")
	public WebElement search;
	
	
	public WebElement getLoction() {
		return loction;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
