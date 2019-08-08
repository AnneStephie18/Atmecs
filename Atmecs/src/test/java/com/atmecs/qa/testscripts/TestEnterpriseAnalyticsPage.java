package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.EnterpriseAnalyticsPage;
import com.atmecs.qa.testbase.Base;
/**
 * 
 * @author Anne.Sivakumar
 *
 */
public class TestEnterpriseAnalyticsPage extends Base {
	EnterpriseAnalyticsPage enterprise_analytics_page= new EnterpriseAnalyticsPage();
	/**
	 * open the browser 
	 */
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	/**
	 * call Enterprise_Analytics_Menu method
	 */
	@Test
	public void testEnterpriseAnalyticsPageClick()
	{
		
		enterprise_analytics_page.EnterpriseAnalyticsMenu(driver);
		
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
