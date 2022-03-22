package StepDefination;

import Base_Pkg.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before
	public void StartServer()
	{
		startappium();
	}
	@After
	public void StopServer()
	{
		//DriverClose();
		closeappium();
	}
}
