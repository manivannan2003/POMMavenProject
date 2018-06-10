package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	

	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreatelead;
	
	public CreateLead createLeads() {
		click(elecreatelead);
		return new CreateLead();
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleeditlead;
	
	public EditLead editLeads() {
		click(eleeditlead);
		return new EditLead();
		
	}
	
	
	

}
