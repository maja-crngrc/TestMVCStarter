package com.mvcstartertest.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;

import com.mvcstartertest.base.BaseTest;
import com.mvcstartertest.page.FormPage;

public class QA_0001_AddFirstName_Test extends BaseTest {

	public QA_0001_AddFirstName_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_0000_addFirstName_test() throws Exception {
		FormPage formPage = new FormPage(driver, MVCSTARTER_PROPERTIES);
		formPage.addFirstName();
		formPage.validationFirstName();
	}
	

}