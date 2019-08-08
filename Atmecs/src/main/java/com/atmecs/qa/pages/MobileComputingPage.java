package com.atmecs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate mobile computing page navigation with data of each page navigated 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
 * @author Anne.Sivakumar
 *
 */
public class MobileComputingPage {
	public WebDriver driver;
	Helper helperobject=Helper.getInstance();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	public String propertyfilepath=Constants.PROJECT_MOBILECOMPUTING_PATH;
	/**
	 * validate mobile computing page navigation by verifying page mobile computing title 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * 
	 * @param driver
	 */
	public void MobileComputingMenu(WebDriver driver)
	{
		digitallifepageobject.mouseOverServiceMenu(driver);
		//By reading_mobile_computing_xpath=helperobject.loadProperty(driver, "mobile_computing_submenu",propertyfilepath);
		commmon_utility.click(driver, helperobject.getValue("mobile_computing_submenu"));
		
		//By reading_title_xpath=helperobject.loadProperty(driver, "mobile_computing_title",propertyfilepath);
		String mobile_computing_title=commmon_utility.getTitle(driver, helperobject.getValue("mobile_computing_title"));
		commmon_utility.verifyAssertTitle(mobile_computing_title, "Mobile Computing");
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
}
