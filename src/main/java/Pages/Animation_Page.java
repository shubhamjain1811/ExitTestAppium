package Pages;

import org.openqa.selenium.support.PageFactory;

import Base_Pkg.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Animation_Page extends BaseClass{
	AppiumDriver<MobileElement> drivers;
	public Animation_Page(AppiumDriver<MobileElement> driver)
	{
		drivers=driver;
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Animation\"]")
	public MobileElement Animation1;
	

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Bouncing Balls\"]")
	public MobileElement Bouncing_Balls;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement Changing_colour;
	
	
	
	public void Animation_S1()
	{
		Animation1.click();
	}
	public void Animation_S2()
	{
		Bouncing_Balls.click();
	}
//	public void Animation_S3()
//	{
//		Changing_Colour();
//	}
//	
}
