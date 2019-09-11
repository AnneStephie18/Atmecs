package com.atmecs.qa.pages;

import org.openqa.selenium.WebDriver;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate cloud services page navigation with data of each page navigated 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
 */
public class CloudServicesPage {
	Helper helperobject=Helper.getInstance();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	/**
	 * validate cloud services page navigation by verifying page cloud services title 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 */
	public void cloudServicesMenu(WebDriver driver)
	{
		digitallifepageobject.mouseOverServiceMenu(driver);
		commmon_utility.click(driver,helperobject.getValue("cloud_services_submenu"));
		
		String cloud_services_title=commmon_utility.getTitle(driver, helperobject.getValue("cloud_services_title"));
		commmon_utility.verifyAssertTitle(cloud_services_title, helperobject.getValue("expected_cloud_services_page_title"));
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
	
}
