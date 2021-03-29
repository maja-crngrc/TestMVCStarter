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

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	
	@FindBy(xpath = "//h2")
	private WebElement homePageMessageWE;
	
	
	@FindBy(xpath = "//a[@href=\"customer/showForm\"]")
	private WebElement customerFormWE;
	

		
	
	public void verifyHomePage() {
		
		assertTrue(homePageMessageWE.getText().equals("Spring MVC practice - Home Page"),
			"HomePage: Message is not good!");
	}

	
	
	public void navigateToCustomerForm() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(customerFormWE));
		customerFormWE.click();
	}
	

}
