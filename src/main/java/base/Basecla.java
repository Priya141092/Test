package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.FileReader;



public class Basecla {

	 {
		   
		    WebDriver driver;
			FileReader f = new FileReader();   
			
			
			
			public static void initialization()
			{
				String browsername = f.getData("browser")
				if(browsername.equals("chrome"))
				{
					
					//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
					
					driver= new ChromeDriver();
					
					//System.setProperty("webdriver.chrome.driver", "C:/Users/priya.saxena/Desktop/priya data/Chrome/newc/chromedriver.exe");
				
				}
					
				if(browsername.equals("FF"))
				{
					System.setProperty("webdriver.gecko.driver", "");
					driver= new FirefoxDriver();
				}
				
//				e_driver = new EventFiringWebDriver(driver);
//				eventListener = new WebEventListener();
//				e_driver.register(eventListener);
//				driver=e_driver;
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}


		

	}

}
