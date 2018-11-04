package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class HomePage extends TestBase {

	// (Page factory - Object repository (get xpaths for all the elements on the
	// page)
	@FindBy(xpath = "//td[contains(text(),'User: Selenium test')]")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;

	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;

	@FindBy(xpath = "//a[contains(text(),'Companies')]")
	WebElement companiesLink;

	@FindBy(xpath = "//a[contains(text(),'Calendar')]")
	WebElement calendarLink;

	@FindBy(xpath = "//a[contains(text(),'Cases')]")
	WebElement casesLink;

	@FindBy(xpath = "//a[contains(text(),'Call')]")
	WebElement callLink;

	@FindBy(xpath = "//a[contains(text(),'Email')]")
	WebElement emailLink;

	@FindBy(xpath = "//a[contains(text(),'Text/SMS')]")
	WebElement textsmsLink;

	@FindBy(xpath = "//a[contains(text(),'Print')]")
	WebElement printLink;

	@FindBy(xpath = "//a[contains(text(),'Campaigns')]")
	WebElement campaignsLink;

	@FindBy(xpath = "//a[contains(text(),'Docs')]")
	WebElement docsLink;

	@FindBy(xpath = "//a[contains(text(),'Forms')]")
	WebElement formsLink;

	@FindBy(xpath = "//a[contains(text(),'Reports')]")
	WebElement reportsLink;

	// Initialize the Page object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Verify home page title
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	// Verify correct username
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}

	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}

	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}

	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}

	public EmailPage clickOnEmailLink() {
		emailLink.click();
		return new EmailPage();
	}

	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();

	}

}
