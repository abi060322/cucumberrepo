package org.StepDefinition;

import org.helper.Baseclass;
import org.pom.Adactinpojo1;

import cucumber.api.java.en.*;

public class AdactinloginDefine extends Baseclass {
	
public static 	Adactinpojo1 a;
	
	@Given("To launch adactin browser")
	public void to_launch_adactin_browser() {
		browserlaunch();
	    lauchURL("https://adactinhotelapp.com/");
	    maxwin();
	}

	@When("To enter valid username in usernamefield")
	public void to_enter_valid_username_in_usernamefield() {
	    a=new Adactinpojo1();
	    filltextbox(a.getName(),"abinayasubin");
	    System.out.println("name passed");
	}

	@When("To enter valid password in passwodfield")
	public void to_enter_valid_password_in_passwodfield() {
	   filltextbox(a.getPassword(), "ABINAYASUBIN");
	   System.out.println("password passed");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	    btnclick(a.getLogin());
	}

	@Then("is login passed")
	public void is_login_passed() {
	    System.out.println("login passed");
	}



}
