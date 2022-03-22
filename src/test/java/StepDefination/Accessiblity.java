package StepDefination;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import Base_Pkg.BaseClass;
import Pages.Accessiblity_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Accessiblity extends BaseClass {
	//Accessiblity_Page obj1=new Accessiblity_Page(wd);
	static Logger logger=LogManager.getLogger(Accessiblity.class); 
	Accessiblity_Page obj1;
	@Given("^The application is on Running Status$")
	public void the_application_is_on_Running_Status() throws Throwable {
		setUp();
		logger.info("Application running");
	    }

	@And("^I click on Accessiblity$")
	public void i_click_on_Access() throws Throwable {
		obj1=new Accessiblity_Page(wd);
		obj1.Accessiblity_S1();
		logger.info("Accessiblity click ");
	}

	@When("^I click on Accessiblity Node Provider$")
	public void i_click_on_Accessiblity_Node_Provider() throws Throwable {
		obj1=new Accessiblity_Page(wd);
		obj1.Accessiblity_S2();
		logger.info("Accessiblity Node Provider click ");
	    }

	@Then("^Accessiblity Node Provider Opens$")
	public void accessiblity_Node_Provider_Opens() throws Throwable {
		obj1=new Accessiblity_Page(wd);
		Assert.assertEquals(obj1.ColouredSquare.getText(), "Accessibility/Accessibility Node Provider");
		DriverClose();
		logger.info("Back to Home after Accessiblity ");
		//closeappium();
	}

}
