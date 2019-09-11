package com.atmecs.qa.pages;

import org.openqa.selenium.WebDriver;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate enterprise analytics page navigation with data of each page navigated 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
 */
public class EnterpriseAnalyticsPage {
	Helper helperobject=Helper.getInstance();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	/**
	 * validate enterprise analytics page navigation by verifying page enterprise analytics title 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
     */
	public void EnterpriseAnalyticsMenu(WebDriver driver)
	{
		digitallifepageobject.mouseOverServiceMenu(driver);
		commmon_utility.click(driver, helperobject.getValue("enterprise_analytics_submenu"));
		
		String enterprise_analytics_title=commmon_utility.getTitle(driver, helperobject.getValue("enterprise_analytics_title"));
		commmon_utility.verifyAssertTitle(enterprise_analytics_title, helperobject.getValue("expected_enterprise_anlytics_page_title"));
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
}
