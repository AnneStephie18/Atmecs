package com.atmecs.qa.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate services page navigation with data of each page navigated  
 * Perform click operation on hyper link and validate page navigation is navigated 
 * Perform click operation on read more button and validate page navigation is navigated  
 * Perform click operation on home icon validate the home page is navigated back  
 * verify page navigation with the title of the page
 */
public class ServicePage
{
	CommonUtilityMethods commmon_utility = new CommonUtilityMethods();
	Helper helperobject=Helper.getInstance();
	/**
	 * validate service page navigation by verifying page service title
	 * click read more button and validate page navigation by verifying each page title
	 * click hyper link and validate page navigation by verifying each page title
	 * Perform click operation on home icon validate the home page is navigated back  
	 * @param driver
	 */
	public void ServiceMenu(WebDriver driver) 
	{
		commmon_utility.click(driver, helperobject.getValue("servicemenu"));
		verifyTitle(driver, "Services");

		List<String> actual_hyperlink = commmon_utility.countNumberOfServices(driver, helperobject.getValue("servicepage_hyperlink_count"));
		commmon_utility.verifyAssertListOfText(actual_hyperlink, serviceTextlink());

		List<String> actual_readmore = commmon_utility.countReadMoreButton(driver, helperobject.getValue("servicepage_readmore_count"));
		commmon_utility.verifyAssertListOfText(actual_readmore, servicepageReadmore());
		
		performClickNumberOfServices(driver,"enterprise-anlaytics-hyperlink",helperobject.getValue("expected_enterprise_anlytics_page_title"));
		performClickNumberOfServices(driver,"cloud-services-hyperlink",helperobject.getValue("expected_cloud_services_page_title"));
		performClickNumberOfServices(driver,"product-engineering-hyperlink",helperobject.getValue("expected_product_engineering_page_title"));
		performClickNumberOfServices(driver,"automation-engineering-hyperlink",helperobject.getValue("expected_quality_engineering_page_title"));
		performClickNumberOfServices(driver,"mobile-computing-hyperlink",helperobject.getValue("expected_mobile_computing_page_title"));
		performClickNumberOfServices(driver,"digital-life-hyperlink",helperobject.getValue("expected_digital_life_page_title"));
		performClickNumberOfServices(driver,"infrastructure-services-hyperlink",helperobject.getValue("expected_infrastructure_services_page_title"));
		
		performClickReadMoreButton(driver,"enterprise-anlaytics_readmore_button", helperobject.getValue("expected_enterprise_anlytics_page_title"));
		performClickReadMoreButton(driver,"cloud-services_readmore_button", helperobject.getValue("expected_cloud_services_page_title"));
		performClickReadMoreButton(driver,"product-engineering_readmore_button",helperobject.getValue("expected_product_engineering_page_title"));
		performClickReadMoreButton(driver,"automation-engineering_readmore_button",helperobject.getValue("expected_quality_engineering_page_title"));
		performClickReadMoreButton(driver,"mobile-computing_readmore_button",helperobject.getValue("expected_mobile_computing_page_title"));
		performClickReadMoreButton(driver,"digital-life_readmore_button",helperobject.getValue("expected_digital_life_page_title"));
		performClickReadMoreButton(driver,"infrastructure_services_readmore_button", helperobject.getValue("expected_infrastructure_services_page_title"));
		
		clickOnHomeText(driver);
	}

	//perform click operation for service icon 
	public void clickOnServiceText(WebDriver driver) 
	{
		commmon_utility.click(driver, helperobject.getValue("services_text"));
	}

	//perform click operation for home icon 
	public void clickOnHomeText(WebDriver driver) 
	{
		commmon_utility.click(driver, helperobject.getValue("home_text"));
	}

	//add the list of elements into the list 
	public List<String> serviceTextlink() 
	{
		List<String> hyperlink_content_expexted = new ArrayList<String>();
		hyperlink_content_expexted.add(helperobject.getValue("expected_enterprise_anlytics_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_cloud_services_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_product_engineering_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_automation_engineering_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_mobile_computing_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_digital_life_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_infrastructure_services_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_sitemap_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_services_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_careers_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_contactus_page_title"));
		return hyperlink_content_expexted;
	}

	//add the list of elements into the list 
	public List<String> servicepageReadmore() 
	{
		List<String> readmore_content_expexted = new ArrayList<String>();
		for(int i=1;i<=7;i++)
		{
		readmore_content_expexted.add(helperobject.getValue("readmoretext"));
		}
		return readmore_content_expexted;
	}

	//perform click operation
	public void clickReadMoreButton(WebDriver driver, String key_xpath) 
	{
		commmon_utility.click(driver, helperobject.getValue(key_xpath));
	}

	// verify title of the page
	public void verifyTitle(WebDriver driver, String expectedtitle) 
	{
		String servicepagetitle = commmon_utility.getTitle(driver, helperobject.getValue("servicetitle"));
		commmon_utility.verifyAssertTitle(servicepagetitle, expectedtitle);
	}
	
	//perform click operation on read more button
	public void performClickReadMoreButton(WebDriver driver,String xpath,String expectedtitle)
	{
		clickReadMoreButton(driver, xpath);
		verifyTitle(driver, expectedtitle);
		clickOnServiceText(driver);
	}
	//perform click operation on number of services
	public void performClickNumberOfServices(WebDriver driver,String xpath,String expectedtitle)
	{
		commmon_utility.click(driver, helperobject.getValue(xpath));
		verifyTitle(driver,expectedtitle);
		clickOnServiceText(driver);
	}
}
