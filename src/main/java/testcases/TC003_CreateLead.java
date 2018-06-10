package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Creating a Lead in Leaf Tap and verify the same";
		testNodes="Leads";
		category="Smoke";
		authors="Manivannan";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String compName,String firstName,String lastName,String phoneNo) {
		
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.createLeads()
		.compName(compName)
		.firstName(firstName)
		.lastName(lastName)
		.phoneNumber(phoneNo)
		.clickCreateLeadButton()
		.verifyFirstName(firstName);
		
		
	}

}
