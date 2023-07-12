package Demoselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import Utils.FileReader;




public class seleniumdemo  {
	
	
     static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeBrowser(FileReader.getData("browser"));
        navigateToUrl();
        login();
        tearDown();
	}
        
       public static void initializeBrowser(String browser)
       {    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
    	   switch(browser)
    	   {
    	   
    	   case "chrome":
    		   
    	   driver = new ChromeDriver(options);
//    	   case "edge":
//    	  driver = new EdgeDriver();
    	  break;
    	   
    	   }
    	   }
       
		
	
	public static void navigateToUrl()
       {
    	   driver.get("https://phptravels.com/demo/");
    	   
       }
	public static void login()
	{
		WebElement input1 = driver.findElement(By.xpath(""));
		input1.click();
	}
	
	public static void tearDown()
	{
		driver.quit();
	}	
	}


