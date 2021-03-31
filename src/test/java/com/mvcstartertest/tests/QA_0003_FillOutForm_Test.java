package com.mvcstartertest.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;

import com.mvcstartertest.base.BaseTest;
import com.mvcstartertest.page.FormPage;

public class QA_0003_FillOutForm_Test extends BaseTest {

	public QA_0003_FillOutForm_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_0002_verifyFirstName_test() throws Exception {
		FormPage formPage = new FormPage(driver, MVCSTARTER_PROPERTIES);
		formPage.fillOutForm("Maja", "Crnogorac", "5", "12345", "TEST123");
		//verify filled data
	}
	

}