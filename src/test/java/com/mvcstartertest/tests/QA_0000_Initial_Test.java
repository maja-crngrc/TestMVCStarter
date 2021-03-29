package com.mvcstartertest.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;

import com.mvcstartertest.base.BaseTest;
import com.mvcstartertest.page.FormPage;

public class QA_0000_Initial_Test extends BaseTest {

	public QA_0000_Initial_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_0000_initial_test() throws Exception {
		FormPage formPage = new FormPage(driver, MVCSTARTER_PROPERTIES);
		
	}

}