package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.atmecs.qa.pages.ServicePage;
import com.atmecs.qa.testbase.Base;
/**
 * 
 * @author Anne.Sivakumar
 *
 */
public class TestServicePage  extends Base
{
	
	ServicePage servicepage= new ServicePage();
	/**
	 * open the browser 
	 */
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	/**
	 * call ServiceMenu method
	 */
	@Test
	public void testServicePageClick()
	{
		
		servicepage.ServiceMenu(driver);
		
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
