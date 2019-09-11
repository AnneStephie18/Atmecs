package com.atmecs.qa.pages;

import org.openqa.selenium.WebDriver;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate quality engineering page navigation with data of each page navigated 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
  */
public class QualityEngineeringPage {
	Helper helperobject=Helper.getInstance();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	/**
	 * validate quality engineering page navigation by verifying page quality engineering title 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
     */
	public void QualityEngineeringMenu(WebDriver driver)
	{
		digitallifepageobject.mouseOverServiceMenu(driver);
		commmon_utility.click(driver, helperobject.getValue("quality_enginnering_submenu"));
		
		String quality_engineering_title=commmon_utility.getTitle(driver, helperobject.getValue("quality_enginnering_title"));
		commmon_utility.verifyAssertTitle(quality_engineering_title, helperobject.getValue("expected_quality_engineering_page_title"));
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
}
