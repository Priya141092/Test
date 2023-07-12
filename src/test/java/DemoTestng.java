import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Demoselenium.seleniumdemo;

public class DemoTestng extends seleniumdemo {
	
	seleniumdemo s = new seleniumdemo();
//	DemoTestng()
//	{
//		super();
//	}
	
	@BeforeMethod
	public void initialise()
	{
	 s.initializeBrowser("chrome");
	}
	

}
