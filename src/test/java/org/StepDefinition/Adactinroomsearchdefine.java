package org.StepDefinition;

import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.pom.AdactinPojo2;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactinroomsearchdefine extends Baseclass {
	
	public static AdactinPojo2 a;
	
	
	@When("To select the location of hotel")
	public void to_select_the_location_of_hotel() {
		
		a=new AdactinPojo2();
	    WebElement loction = a.getLoction();
	    selectbyvalue(loction, "Sydney");
	}

	@When("To select the hotel")
	public void to_select_the_hotel() {
	    selectbyvisibletext(a.getHotels(), "Hotel Sunshine");
	}

	@When("To select the room type")
	public void to_select_the_room_type() {
	    selectbyvalue(a.getRoomtype(), "Double");
	}

	@When("To select no of rooms")
	public void to_select_no_of_rooms() {
	    selectbyvisibletext(a.getRoomnos(), "2 - Two");
	}


	@When("To click the search button")
	public void to_click_the_search_button() {
	    btnclick(a.getSearch());
	}

	@Then("Is room searched")
	public void is_room_searched() {
	    System.out.println("room searched");
	}




}
