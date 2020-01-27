package xbox.testcases;

import org.testng.annotations.*;

import org.testng.Assert;

import xbox.basepages.*;
import util.TestCaseBase;

public class XboxDuskamo extends TestCaseBase {
	String browserFlag = "Chrome";
	String runningOnGrid = "false";
	String hubHost = "0";
	String hubPort = "0";
	
	
	
	public String dusk = "samarisam97";

	@BeforeTest
	public void f() {
		try {
			TestCaseBase base = new TestCaseBase();
			base.setUpBrowser(browserFlag, runningOnGrid, hubHost, hubPort);
			// open();
		} catch (Exception ex) {

		}
	}

	@Test(groups = { "ChromeWin32" }, priority = 0)
	public void xboxSearchValidateDuskamoTest() throws Exception {
		XboxGamertagSearchPage xblSearch = new XboxGamertagSearchPage();
		xblSearch.open();
		xblSearch.waitPageLoad();
		Assert.assertTrue(xblSearch.titleIs(XboxGamertagSearchPage.TITLE));
	}
	
	@Test(groups = {"ChromeWin32"}, priority = 1)
	public void xboxDuskamoCheck() throws Exception {
		XboxGamertagSearchPage xblSearch  = new XboxGamertagSearchPage();
		xblSearch.open();
		xblSearch.waitPageLoad();
		XboxDuskamoPage xblDuskamo = xblSearch.goToSearch();
		xblDuskamo.waitPageLoad();
		Assert.assertTrue(xblDuskamo.titleIs(XboxDuskamoPage.TITLE));
	}

	@Test(groups = {"ChromeWin32"}, priority = 2)
	public void xboxDuskTopGames() throws Exception {
		XboxGamertagSearchPage xblSearch  = new XboxGamertagSearchPage();
		xblSearch.open();
		xblSearch.waitPageLoad();
		XboxDuskamoPage xblDuskamo = xblSearch.goToSearch();
		xblDuskamo.waitPageLoad();
		Assert.assertTrue(xblDuskamo.gamesCheck());
	}
	/*
	@AfterTest
	public void closeChrome() {
		TestCaseBase.threadDriver.get().close();
	}*/
}
