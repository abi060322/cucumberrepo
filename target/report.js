$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature files/adactin.feature");
formatter.feature({
  "name": "",
  "description": "To validate roon booking functionality of adctin hotels",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "To validate login functionality",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch adactin browser",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinloginDefine.to_launch_adactin_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter valid username in usernamefield",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinloginDefine.to_enter_valid_username_in_usernamefield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter valid password in passwodfield",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinloginDefine.to_enter_valid_password_in_passwodfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinloginDefine.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "is login passed",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinloginDefine.is_login_passed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": " To validate search room functionality of adactin hotels",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To select the location of hotel",
  "keyword": "When "
});
formatter.match({
  "location": "Adactinroomsearchdefine.to_select_the_location_of_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select the hotel",
  "keyword": "And "
});
formatter.match({
  "location": "Adactinroomsearchdefine.to_select_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select the room type",
  "keyword": "And "
});
formatter.match({
  "location": "Adactinroomsearchdefine.to_select_the_room_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select no of rooms",
  "keyword": "And "
});
formatter.match({
  "location": "Adactinroomsearchdefine.to_select_no_of_rooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Adactinroomsearchdefine.to_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Is room searched",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactinroomsearchdefine.is_room_searched()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": " To validate Select hotel functionality of adactin hotel",
  "keyword": "Scenario"
});
formatter.step({
  "name": "to click the hotel name",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinSelectHotelDefine.to_click_the_hotel_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSelectHotelDefine.to_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Is hotel selected",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinSelectHotelDefine.is_hotel_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To validate book now functionality of adactin hotels",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To enter valid First name in namefield",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinBookNowDefine.to_enter_valid_First_name_in_namefield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter valid last name in namefield",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinBookNowDefine.to_enter_valid_last_name_in_namefield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter valid billing address",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinBookNowDefine.to_enter_valid_billing_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter valid card no",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinBookNowDefine.to_enter_valid_card_no()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select card type",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinBookNowDefine.to_select_card_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select month",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinBookNowDefine.to_select_month()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select year",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinBookNowDefine.to_select_year()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter valid cvv no",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinBookNowDefine.to_enter_valid_cvv_no()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click book now button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinBookNowDefine.to_click_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Is room booked",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinBookNowDefine.is_room_booked()"
});
formatter.result({
  "status": "passed"
});
});