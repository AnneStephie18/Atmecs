package com.atmecs.qa.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate infrastructure services page navigation with data of each page navigated 
 * Perform click operation on read more button and validate page navigation is navigated 
 * Perform click operation on service icon and validate the service page is navigated back
 * Perform click operation on home icon and validate the home page is navigated back
 * verify page navigation with the title of the page
  */
public class InfrastructureServicesPage {
	Helper helperobject = Helper.getInstance();
	CommonUtilityMethods commmon_utility = new CommonUtilityMethods();
	ServicePage servicepageobject = new ServicePage();
	DigitalLifePage digitallifepageobject = new DigitalLifePage();
	/**
	 * validate infrastructure services page navigation by verifying page infrastructure services title 
	 * click read more button and validate page navigation by verifying each page title 
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
     */
	public void infrastructure_Services_Menu(WebDriver driver) {
		
		digitallifepageobject.mouseOverServiceMenu(driver);
		commmon_utility.click(driver, helperobject.getValue("infrastructure_services_submenu"));

		servicepageobject.verifyTitle(driver, helperobject.getValue("expected_infrastructure_services_page_title"));

		List<String> actual_heading = commmon_utility.countNumberOfServices(driver, helperobject.getValue("infrastructure_services_heading"));
		commmon_utility.verifyAssertListOfText(actual_heading, infrastructure_servicespage_hyperlink());

		List<String> actual_readmore = commmon_utility.countReadMoreButton(driver, helperobject.getValue("infrastructure_services_readmore_count"));
		commmon_utility.verifyAssertListOfText(actual_readmore, digitallifepageobject.digitalLifepageReadmore());

		performClickReadMoreButton(driver,"infrastructure_management_readmore","expected_infrastructure_management_page_title");
		servicepageobject.clickReadMoreButton(driver, "cloud_readmore");
		commmon_utility.navigateTo(driver);
		performClickReadMoreButton(driver,"devops_readmore","expected_devops_page_title");
		performClickReadMoreButton(driver,"NOCservices_readmore","expected_noc_services_page_title");
		performClickReadMoreButton(driver,"datacenter_management_readmore","expected_data_center_management_page_title");

		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}

	// add the list of elements into the list
	public List<String> infrastructure_servicespage_hyperlink() {
		List<String> hyperlink_content_expexted = new ArrayList<String>();
		hyperlink_content_expexted.add(helperobject.getValue("expected_infrastructure_management_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_cloud_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_devops_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_noc_services_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_data_center_management_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_sitemap_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_services_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_careers_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_contactus_page_title"));
		return hyperlink_content_expexted;
	}

	public void performClickReadMoreButton(WebDriver driver,String xpath,String expectedtitle)
	{
		servicepageobject.clickReadMoreButton(driver, xpath);
		servicepageobject.verifyTitle(driver, helperobject.getValue(expectedtitle));
		clickOnInfrastructureServicesText(driver);
	}
	
	//perform click operation for infrastructure services icon 
	public void clickOnInfrastructureServicesText(WebDriver driver) {
		commmon_utility.click(driver, helperobject.getValue("infrastructure_services_icon"));
	}
	/**
	 * validate infrastructure management page navigation by verifying page infrastructure management title
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back   
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void infrastructure_management_submenu(WebDriver driver) {
		digitallifepageobject.mouseOverServiceMenu(driver);
		helperobject.explixitWait(driver, "infrastructure_services_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("infrastructure_services_submenu"));
		helperobject.explixitWait(driver, "infrastructure_management_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("infrastructure_management_submenu"));
		commmon_utility.click(driver, helperobject.getValue("infrastructure_management_submenu"));
		servicepageobject.verifyTitle(driver, helperobject.getValue("expected_infrastructure_management_page_title"));
		clickOnInfrastructureServicesText(driver);
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
	/**
	 * validate cloud infrastructure page navigation by verifying page cloud infrastructure title
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back   
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void cloud_infrastructure_submenu(WebDriver driver) {
		digitallifepageobject.mouseOverServiceMenu(driver);
		helperobject.explixitWait(driver, "infrastructure_services_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("infrastructure_services_submenu"));
		commmon_utility.performMouseOver(driver, helperobject.getValue("cloud_infrastructure_submenu"));
		helperobject.explixitWait(driver, "cloud_infrastructure_submenu");
		commmon_utility.click(driver, helperobject.getValue("cloud_infrastructure_submenu"));
		servicepageobject.verifyTitle(driver, helperobject.getValue("expected_cloud_infrastructure_page_title"));
		clickOnInfrastructureServicesText(driver);
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
	/**
	 * validate devops page navigation by verifying page devops title
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back   
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void devops_submenu(WebDriver driver) {
		digitallifepageobject.mouseOverServiceMenu(driver);
		helperobject.explixitWait(driver, "infrastructure_services_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("infrastructure_services_submenu"));
		commmon_utility.performMouseOver(driver, helperobject.getValue("devops_submenu"));
		helperobject.explixitWait(driver, "devops_submenu");
		commmon_utility.click(driver, helperobject.getValue("devops_submenu"));
		servicepageobject.verifyTitle(driver, helperobject.getValue("expected_devops_page_title"));
		clickOnInfrastructureServicesText(driver);
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
	/**
	 * validate NOC services page navigation by verifying page NOC services title
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back   
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void NOC_services_submenu(WebDriver driver) {
		digitallifepageobject.mouseOverServiceMenu(driver);
		helperobject.explixitWait(driver, "infrastructure_services_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("infrastructure_services_submenu"));
		helperobject.explixitWait(driver, "NOC_services_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("NOC_services_submenu"));
		commmon_utility.click(driver, helperobject.getValue("NOC_services_submenu"));
		servicepageobject.verifyTitle(driver,helperobject.getValue("expected_noc_services_page_title"));
		clickOnInfrastructureServicesText(driver);
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
	/**
	 * validate data center management page navigation by verifying page data center management title
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back   
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void datacenter_management_submenu(WebDriver driver) {
		digitallifepageobject.mouseOverServiceMenu(driver);
		helperobject.explixitWait(driver, "infrastructure_services_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("infrastructure_services_submenu"));
		helperobject.explixitWait(driver, "datacenter_management_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("datacenter_management_submenu"));
		commmon_utility.click(driver, helperobject.getValue("datacenter_management_submenu"));
		servicepageobject.verifyTitle(driver, helperobject.getValue("expected_data_center_management_page_title"));
		clickOnInfrastructureServicesText(driver);
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
}
