package Step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Booking__ {
	
	@Given("User should have an account")
	public void user_should_have_an_account() {
	   System.out.println("yes");
	   
	}

	@When("Enter the user name")
	public void enter_the_user_name() {
		System.out.println("yes");
	   
	   
	}

	@When("enter the password")
	public void enter_the_password() {
		System.out.println("yes");
	   
	}

	@Then("redirect to home page")
	public void redirect_to_home_page() {
		System.out.println("yes");
	   
	}

	@Then("user name display in home page")
	public void user_name_display_in_home_page() {
		System.out.println("yes");
	   
	}

	@Given("Search box with theatre movie")
	public void search_box_with_theatre_movie() {
	   
		System.out.println("yes");
	}

	@When("Enter the movie name in search box")
	public void enter_the_movie_name_in_search_box() {
		System.out.println("yes");
	   
	}

	@When("select the movie")
	public void select_the_movie() {
	   
		System.out.println("yes");
	}

	@Then("redirect to the booking page")
	public void redirect_to_the_booking_page() {
	   
		System.out.println("yes");
	}

	@Then("movie name is displayed in that page")
	public void movie_name_is_displayed_in_that_page() {
	   
		System.out.println("yes");
	}

	@Given("ticket booking page")
	public void ticket_booking_page() {
		System.out.println("yes");
	   
	}

	@When("select the nos of ticket")
	public void select_the_nos_of_ticket() {
	   
		System.out.println("yes");
	}

	@When("payable amount displayed correctly")
	public void payable_amount_displayed_correctly() {
		System.out.println("yes");
	   
	}

	@Then("redirect to payment page")
	public void redirect_to_payment_page() {
	   
		System.out.println("yes");
	}

}