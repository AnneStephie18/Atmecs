package com.atmecs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate enterprise analytics page navigation with data of each page navigated 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
 * @author Anne.Sivakumar
 *
 */
public class EnterpriseAnalyticsPage {
	public WebDriver driver;
	Helper helperobject=Helper.getInstance();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	public String propertyfilepath=Constants.PROJECT_ENTERPRISEANALYTICS_PATH;
	/**
	 * validate enterprise analytics page navigation by verifying page enterprise analytics title 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * 
	 * @param driver
	 */
	public void EnterpriseAnalyticsMenu(WebDriver driver)
	{
		digitallifepageobject.mouseOverServiceMenu(driver);
		//By reading_enterprise_analytics_xpath=helperobject.loadProperty(driver, "enterprise_analytics_submenu",propertyfilepath);
		commmon_utility.click(driver, helperobject.getValue("enterprise_analytics_submenu"));
		
		//By reading_title_xpath=helperobject.loadProperty(driver, "enterprise_analytics_title",propertyfilepath);
		String enterprise_analytics_title=commmon_utility.getTitle(driver, helperobject.getValue("enterprise_analytics_title"));
		commmon_utility.verifyAssertTitle(enterprise_analytics_title, "Enterprise Analytics");
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
}
