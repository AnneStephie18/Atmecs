package com.atmecs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate cloud services page navigation with data of each page navigated 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
 * @author Anne.Sivakumar
 *
 */
public class CloudServicesPage {
	public WebDriver driver;
	Helper helperobject=Helper.getInstance();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	public String propertyfilepath=Constants.PROJECT_CLOUDSERVICES_PATH;
	/**
	 * validate cloud services page navigation by verifying page cloud services title 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * 
	 * @param driver
	 */
	public void cloudServicesMenu(WebDriver driver)
	{
		digitallifepageobject.mouseOverServiceMenu(driver);
		//By reading_cloud_services_xpath=helperobject.loadProperty(driver, "cloud_services_submenu",propertyfilepath);
		//commmon_utility.click(driver, reading_cloud_services_xpath);
		commmon_utility.click(driver,helperobject.getValue("cloud_services_submenu"));
		
		//By reading_title_xpath=helperobject.loadProperty(driver, "cloud_services_title",propertyfilepath);
		String cloud_services_title=commmon_utility.getTitle(driver, helperobject.getValue("cloud_services_title"));
		commmon_utility.verifyAssertTitle(cloud_services_title, "Cloud Services");
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
	
}
