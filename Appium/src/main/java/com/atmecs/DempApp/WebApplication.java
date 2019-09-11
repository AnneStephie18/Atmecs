package com.atmecs.DempApp;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class WebApplication {
	public AndroidDriver<WebElement> driver;
	DesiredCapabilities capabilities;
	@BeforeMethod
	public void setup()
	{
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("deviceName","Emulator");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("udid","192.168.119.102:5555");
	}
    @Test
    public void SearchText() throws MalformedURLException
    {
    	driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
	 driver.get("https://www.google.com/"); 
	 WebElement searchtext=driver.findElement(By.name("q"));
	 searchtext.sendKeys("appium");
	 searchtext.sendKeys(Keys.ENTER);
	 
    }
    @AfterMethod
    public void quit()
    {
    	driver.quit();
    }
}
