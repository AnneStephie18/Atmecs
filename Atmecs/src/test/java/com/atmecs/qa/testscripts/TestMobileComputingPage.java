package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.MobileComputingPage;
import com.atmecs.qa.testbase.Base;
/**
 * 
 * @author Anne.Sivakumar
 *
 */
public class TestMobileComputingPage extends Base{
	MobileComputingPage mobile_computing_page= new MobileComputingPage();
	/**
	 * open the browser 
	 */
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	/**
	 * call Mobile_Computing_Menu method
	 */
	@Test
	public void testMobileComputingClick()
	{
		mobile_computing_page.MobileComputingMenu(driver);
		
	}
	
	/**
	 * quit the browser 
	 */
	@AfterTest
	public void tearDown()
	{
		quitBrowser();
	}
}
