package com.atmecs.qa.pages;

import org.openqa.selenium.WebDriver;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate mobile computing page navigation with data of each page navigated 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
  */
public class MobileComputingPage {
	Helper helperobject=Helper.getInstance();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	/**
	 * validate mobile computing page navigation by verifying page mobile computing title 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 */
	public void MobileComputingMenu(WebDriver driver)
	{
		digitallifepageobject.mouseOverServiceMenu(driver);
		commmon_utility.click(driver, helperobject.getValue("mobile_computing_submenu"));
		
		String mobile_computing_title=commmon_utility.getTitle(driver, helperobject.getValue("mobile_computing_title"));
		commmon_utility.verifyAssertTitle(mobile_computing_title, helperobject.getValue("expected_mobile_computing_page_title"));
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
}
