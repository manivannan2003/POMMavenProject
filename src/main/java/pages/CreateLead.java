package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecmpname;
	
	public CreateLead compName(String data) {
		type(elecmpname, data);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefirstname;
	
	public CreateLead firstName(String data) {
		type(elefirstname, data);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastname;
	
	public CreateLead lastName(String data) {
		type(elelastname, data);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNumber;
	
	public CreateLead phoneNumber(String data) {
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
