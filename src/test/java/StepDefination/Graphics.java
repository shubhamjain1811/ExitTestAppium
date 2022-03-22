package StepDefination;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import Base_Pkg.BaseClass;
import Pages.Graphics_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Graphics extends BaseClass {
	Graphics_Page obj5;
	static Logger logger=LogManager.getLogger(Graphics.class); 
@Given("^The app is on Running Status$")
public void the_app_is_on_Running_Status() throws Throwable {
	setUp();
	logger.info("Application is running for Graphics Test");
    }

@And("^I click on Graphics$")
public void i_click_on_Graphics() throws Throwable {
	obj5=new Graphics_Page(wd);
	obj5.Graphics_S1();
	logger.info("Graphics click");
}

@When("^I click on AlphaBitMap$")
public void i_click_on_AlphaBitMap() throws Throwable {
	obj5=new Graphics_Page(wd);
	obj5.Graphics_S2();
	logger.info("AlphaBitMap click");
	
}

@Then("^AlphaBitMap Opens$")
public void alphabitmap_Opens() throws Throwable {
	obj5=new Graphics_Page(wd);
	Assert.assertEquals(obj5.AlphaBitmap_open.getText(), "Graphics/AlphaBitmap");
	DriverClose();
	logger.info("Back to Home after Content Test");
	//closeappium();
}

}
