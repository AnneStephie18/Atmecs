package com.atmecs.DempApp;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DemoAtmecsApp {
	public AndroidDriver<MobileElement> driver;
	DesiredCapabilities capabilities;

	@BeforeMethod
	public void setup() throws MalformedURLException {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("udid", "192.168.119.102:5555");
		capabilities.setCapability("appPackage", "com.atmecs.testdemoapp");
		capabilities.setCapability("appActivity", "com.atmecs.testdemoapp.MainActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
	}

	@Test
	public void Register()  {
		
		 driver.findElement(By.id("com.atmecs.testdemoapp:id/btn_go_to_register_page")).click();
		driver.findElement(By.id("com.atmecs.testdemoapp:id/edittext_enter_username_register")).sendKeys("anne");;
		driver.findElement(By.id("com.atmecs.testdemoapp:id/edittext_enter_email_register")).sendKeys("anne@gmail.com");;
		 driver.findElement(By.id("com.atmecs.testdemoapp:id/edittext_enter_password_register")).sendKeys("anne12345");;
		 driver.findElement(By.id("com.atmecs.testdemoapp:id/edittext_confirm_password_register")).sendKeys("anne12345");;
	driver.findElement(By.id("com.atmecs.testdemoapp:id/btn_register")).click();;
		
		
	

		
	
	}

	@Test
	public void Login() throws MalformedURLException {
		
		driver.findElement(By.id("com.atmecs.testdemoapp:id/btn_go_to_login_page")).click();;
		driver.findElement(By.id("com.atmecs.testdemoapp:id/edittext_enter_username_loginpage")).sendKeys("anne");;
	driver.findElement(By.id("com.atmecs.testdemoapp:id/edittext_enter_password_loginpage")).sendKeys("anne12345");;
		driver.findElement(By.id("com.atmecs.testdemoapp:id/btn_login")).click();;
		
		
	
		
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
