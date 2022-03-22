package StepDefination;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import Base_Pkg.BaseClass;
import Pages.Content_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Content extends BaseClass {
	Content_Page obj4;
	 static Logger logger=LogManager.getLogger(Content.class); 
	@Given("^The applications is on Running Status$")
	public void the_applications_is_on_Running_Status() throws Throwable 
	{
				setUp();
				logger.info("Application is running for Content Test");
	    }

	@And("^I Click on Content button$")
	public void i_Click_on_Content_button() throws Throwable {
		obj4=new Content_Page(wd);
		obj4.Content_S1();
		logger.info("Content click");
	   }

	@And("^I Click on Assets$")
	public void i_Click_on_Assets() throws Throwable {
		obj4=new Content_Page(wd);
		
		obj4.Content_S2();
		logger.info("Asset click");
	}

	@When("^I click On Read Asset$")
	public void i_click_On_Read_Asset() throws Throwable {
		obj4=new Content_Page(wd);
		obj4.Content_S3();
		logger.info("Read Asset click");
	}

	@Then("^Read Asset Open$")
	public void read_Asset_Open() throws Throwable {
		obj4=new Content_Page(wd);
		Assert.assertEquals(obj4.Read_Asset_Opens.getText(),"Content/Assets/Read Asset" );
		DriverClose();
		logger.info("Back to Home after Content Test");
		//closeappium();
	}

}
