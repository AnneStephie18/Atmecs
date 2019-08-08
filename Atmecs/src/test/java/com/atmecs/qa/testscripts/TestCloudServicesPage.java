package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.CloudServicesPage;
import com.atmecs.qa.testbase.Base;
/**
 * 
 * @author Anne.Sivakumar
 *
 */
public class TestCloudServicesPage extends Base {
	CloudServicesPage cloud_services_page= new CloudServicesPage();
	
	/**
	 * open the browser 
	 */
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	/**
	 * call cloud_Services_Menu method
	 */
	@Test
	public void testCloudServicesPageClick()
	{
		cloud_services_page.cloudServicesMenu(driver);
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
