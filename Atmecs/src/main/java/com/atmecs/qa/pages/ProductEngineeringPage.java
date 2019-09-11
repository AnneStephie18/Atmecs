package com.atmecs.qa.pages;

import org.openqa.selenium.WebDriver;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate product engineering page navigation with data of each page navigated 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
  */
public class ProductEngineeringPage {
	Helper helperobject=Helper.getInstance();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	/**
	 * validate product engineering page navigation by verifying page product engineering title 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
     */
	public void ProductEngineeringMenu(WebDriver driver)
	{
		digitallifepageobject.mouseOverServiceMenu(driver);
		commmon_utility.click(driver, helperobject.getValue("product_enginnering_submenu"));
		
		String product_engineering_title=commmon_utility.getTitle(driver, helperobject.getValue("product_enginnering_title"));
		commmon_utility.verifyAssertTitle(product_engineering_title, helperobject.getValue("expected_product_engineering_page_title"));
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
}
