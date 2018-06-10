package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	public EditLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-form-element']/input[@name='firstName'])[3]")
	private WebElement eleFindName;
	
	public EditLead findName(String data) {
		type(eleFindName, data);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="(//button[text()='Find Leads']")
	private WebElement eleFindLeadBTN;
	
	public EditLead clickFindName() {
		click(eleFindLeadBTN);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="((//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a)[1]")
	private WebElement eleSelectLead;
	
	public EditLead clickSelectedLead() {
		click(eleSelectLead);
		return this;
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleClickEditBTN;
	
	public EditLead clickEditBTN() {
		click(eleClickEditBTN);
		return this;
		
	}
	
	//--------------------------------------------------------------------------------------------------------
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefirstname;
	
	public EditLead firstName(String data) {
		type(elefirstname, data);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastname;
	
	public EditLead lastName(String data) {
		type(elelastname, data);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNumber;
	
	public EditLead phoneNumber(String data) {
		type(elePhoneNumber, data);
		return this;
		
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmitButton;
	
	public ViewLead clickCreateLeadButton() {
		click(eleSubmitButton);
		return new ViewLead();
		
	}
	

}
