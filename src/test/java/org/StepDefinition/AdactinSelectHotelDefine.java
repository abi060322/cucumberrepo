package org.StepDefinition;

import org.helper.Baseclass;
import org.pom.Adactinpojo3;

import cucumber.api.java.en.*;

public class AdactinSelectHotelDefine extends Baseclass {

	public static Adactinpojo3 a;
	
	@When("to click the hotel name")
	public void to_click_the_hotel_name() {
	    a= new Adactinpojo3();
	    btnclick(a.getSelect());
	}

	@When("To click continue button")
	public void to_click_continue_button() {
	    btnclick(a.getConti());
	}

	@Then("Is hotel selected")
	public void is_hotel_selected() {
	    System.out.println("is hotel selected");
	}


	
	
	
	
	
}
