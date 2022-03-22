package Pages;

import org.openqa.selenium.support.PageFactory;

import Base_Pkg.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Content_Page extends BaseClass {
	AppiumDriver<MobileElement> drivers;
	public Content_Page(AppiumDriver<MobileElement> driver)
	{
		drivers=driver;
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Content\"]")
	public MobileElement Content1;
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Assets\"]")
	public MobileElement Assest;
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Read Asset\"]")
	public MobileElement Read_Asset;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement Read_Asset_Opens;
	
	public void Content_S1()
	{
		Content1.click();
	}
	public void Content_S2()
	{
		Assest.click();
	}
	public void Content_S3()
	{
		Read_Asset.click();
	}

}
