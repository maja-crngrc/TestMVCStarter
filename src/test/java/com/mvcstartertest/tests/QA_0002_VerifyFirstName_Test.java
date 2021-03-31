package com.mvcstartertest.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;

import com.mvcstartertest.base.BaseTest;
import com.mvcstartertest.page.FormPage;

public class QA_0002_VerifyFirstName_Test extends BaseTest {

	public QA_0002_VerifyFirstName_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_0002_verifyFirstName_test() throws Exception {
		FormPage formPage = new FormPage(driver, MVCSTARTER_PROPERTIES);
		String name = formPage.addFirstName();
		// update addFirstName method to click on submit and then to validate
		System.out.println(name);
	    formPage.verifyFirstName(name);
	}
	

}