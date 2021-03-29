package com.mvcstartertest.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mvcstartertest.base.PageBase;

public class FormPage extends PageBase {
    
	public FormPage(WebDriver driver, String URL) throws FileNotFoundException, IOException {
		super(driver);
		URL = mvcstarter_properties.getValue("URL.FORM");
		driver.get(URL);
	}
	
	@FindBy(xpath = "//i")
	private WebElement fillFormMessageWE;
	
	@FindBy(xpath = "//*[@id='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//*[@id='lastName']")
	private WebElement lastNameWE;
	
	@FindBy(xpath = "//*[@id='freePasses']")
	private WebElement freePassesWE;
	
	@FindBy(xpath = "//*[@id='postalCode']")
	private WebElement postalCodeWE;
	
	@FindBy(xpath = "//*[@id='courseCode']")
	private WebElement courseCodeWE;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement submitBTN;
	
	@FindBy(xpath = "//*[@id='lastName.errors']")
	private WebElement lastNameErrorMsg;
	
	@FindBy(xpath = "//*[@id='freePasses.errors']")
	private WebElement freePassesErrorMsg;
	
	
	public void verifyForm() {
		assertTrue(fillFormMessageWE.getText().equals(mvcstarter_properties.getValue("INFO.MESSAGE")),
				"InfoMessage: Message is not good!");
	}
	
	public void addFirstName() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(firstName));
		firstName.click();
		String name = getRandomName();
		firstName.sendKeys(name);
		submitBTN.click();
	}
	
	public void validationFirstName() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(lastNameErrorMsg));
		assertTrue(lastNameErrorMsg.getText().equals(mvcstarter_properties.getValue("ERROR.MESSAGE")),
				"LastName: Error message is not good!");
		assertTrue(freePassesErrorMsg.getText().equals(mvcstarter_properties.getValue("ERROR.MESSAGE")),
				"FreePasses: Error message is not good!");
	}
}
