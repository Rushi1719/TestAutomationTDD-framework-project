package base;

import java.io.FileReader;


import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	
	public static WebDriver driver ;
	public static Properties prop = new Properties();
	public static Properties Loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	@BeforeMethod
	public void setUp() throws IOException {
		
		if(driver==null) {
		    fr = new FileReader("D:\\eclipse\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		    fr1 = new FileReader("D:\\eclipse\\TestAutomationFramework\\src\\test\\resources\\configfiles\\locators.properties");
		    
			prop.load(fr);	
			Loc.load(fr1);	
	}
	 if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win32\\chromedriver.exe");
            	ChromeOptions options = new ChromeOptions();
        		options.addArguments("--remote-allow-origins=*");
        	    driver=new ChromeDriver(options); //base
        	    driver.get(prop.getProperty("testurl")); //properties
        	   
            }
	}
}      	
	
          
          

