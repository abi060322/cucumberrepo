package org.StepDefinition;

import org.helper.Baseclass;
import org.pom.Adactinpojo4;

import cucumber.api.java.en.*;

public class AdactinBookNowDefine extends Baseclass{
	
	public static Adactinpojo4 a;
	
	@When("To enter valid First name in namefield")
	public void to_enter_valid_First_name_in_namefield() {
	    a=new Adactinpojo4();
	    filltextbox(a.getFirname(), "abinaya");
	}

	@When("To enter valid last name in namefield")
	public void to_enter_valid_last_name_in_namefield() {
	    filltextbox(a.getLasname(), "subin");
	}

	@When("To enter valid billing address")
	public void to_enter_valid_billing_address() {
	   filltextbox(a.getAddress(), "122,madaveethi,pallikaranai");
	}

	@When("To enter valid card no")
	public void to_enter_valid_card_no() {
	    filltextbox(a.getCardno(), "9876453698652345");
	}

	@When("To select card type")
	public void to_select_card_type() {
	   selectbyvalue(a.getCardtype(), "VISA");
	}

	@When("To select month")
	public void to_select_month() {
	   selectbyvisibletext(a.getMonth(), "August");
	}

	@When("To select year")
	public void to_select_year() {
	    selectbyvisibletext(a.getYear(), "2027");
	}

	@When("To enter valid cvv no")
	public void to_enter_valid_cvv_no() {
	    filltextbox(a.getCvvno(), "876");
	}

	@When("To click book now button")
	public void to_click_book_now_button() {
	    btnclick(a.getBooknow());
	}

	@Then("Is room booked")
	public void is_room_booked() {
	    System.out.println("room booked");
	}




}
