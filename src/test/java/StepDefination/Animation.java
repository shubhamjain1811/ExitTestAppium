package StepDefination;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import Base_Pkg.BaseClass;
import Pages.Animation_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Animation extends BaseClass {
Animation_Page obj2;
static Logger logger=LogManager.getLogger(Animation.class); 
	@Given("^The Applications is on Running Status$")
	public void the_Applications_is_on_Running_Status() throws Throwable {
		setUp();
		logger.info("Application is running for automation Test");
	   }

	@And("^I click on Animation$")
	public void i_click_on_Animation() throws Throwable {
		obj2=new Animation_Page(wd);
		obj2.Animation_S1();
		logger.info("Animation click");
	}

	@When("^I click on Bouncing Ball$")
	public void i_click_on_Bouncing_Ball() throws Throwable {
		obj2=new Animation_Page(wd);
		obj2.Animation_S2();
		logger.info("Bouncing Ball click");
	}

	@Then("^Bouncing Balls opens$")
	public void bouncing_Balls_opens() throws Throwable {
		obj2=new Animation_Page(wd);
		Assert.assertEquals(obj2.Changing_colour.getText(), "Animation/Bouncing Balls");
		DriverClose();
		logger.info("Back to Home after Automation");
		//closeappium();}
}
}