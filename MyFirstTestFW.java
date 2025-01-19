package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BaseTest;

public class MyFirstTestFW extends BaseTest{

	@Test(dataProvider="testdata")
	public static void LoginTest(String username, String password) throws InterruptedException 
	{
			
	
	    //System.out.println("Clicked Successfully");
		//driver.findElement(By.xpath(Loc.getProperty("Login_link"))).click();
		driver.manage().window().maximize();
        Thread.sleep(4000);
		driver.findElement(By.id(Loc.getProperty("Username_field"))).sendKeys(username);
		Thread.sleep(4000);
		driver.findElement(By.id(Loc.getProperty("next_button"))).click();
		Thread.sleep(4000);
		driver.findElement(By.id(Loc.getProperty("password_field"))).sendKeys(password);
		Thread.sleep(4000);
        driver.findElement(By.xpath(Loc.getProperty("button_login"))).click();
        Thread.sleep(4000);
        driver.findElement(By.id("continue_button")).click();
        Thread.sleep(3000);
        driver.close();
	}
	@DataProvider(name="testdata")
	public Object[][] tData()
	{
		return new Object[][]
				{
			{"rushikeshkulkarni0003@gmail.com","Rushi@1719"},
			{"rushikeshkulkarni0003@gmail.com","Rushi@123"},
			{"rkgmail03.com","12345"},
			
			
				};
	}
}

