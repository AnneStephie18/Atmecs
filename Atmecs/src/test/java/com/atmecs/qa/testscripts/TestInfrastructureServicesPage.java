package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.InfrastructureServicesPage;
import com.atmecs.qa.testbase.Base;
/**
 * 
 * @author Anne.Sivakumar
 *
 */
public class TestInfrastructureServicesPage extends Base {
	InfrastructureServicesPage infrastructure_services_page= new InfrastructureServicesPage();
	/**
	 * open the browser 
	 */
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	/**
	 * call infrastructure_Services_Menu method
	 */
	@Test(priority=1)
	public void testInfrastructureServicePageClick()
	{
		infrastructure_services_page.infrastructure_Services_Menu(driver);
		
	}
	/**
	 * call infrastructure_management_submenu method
	 */
	@Test(priority=2)
	public void testInfrastructureManagementPageClick()
	{
		infrastructure_services_page.infrastructure_management_submenu(driver);
	}
	/**
	 * call cloud_infrastructure_submenu method
	 */
	@Test(priority=3)
	public void testCloudInfrastructurePageClick()
	{
		infrastructure_services_page.cloud_infrastructure_submenu(driver);
	}
	/**
	 * call devops_submenu method
	 */
	@Test(priority=4)
	public void testDevopsPageClick()
	{
		infrastructure_services_page.devops_submenu(driver);
	}
	/**
	 * call NOC_services_submenu method
	 */
	@Test(priority=5)
	public void testNOCServicesPageClick()
	{
		infrastructure_services_page.NOC_services_submenu(driver);
	}
	/**
	 * call datacenter_management_submenu method
	 */
	@Test(priority=6)
	public void testDataCenterManagementPageClick()
	{
		infrastructure_services_page.datacenter_management_submenu(driver);
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
