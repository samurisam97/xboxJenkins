package xbox.testcases;

import org.testng.annotations.*;
import org.testng.Assert;

import xbox.basepages.*;
import util.TestCaseBase;

public class XboxTopFive extends TestCaseBase {
	String browserFlag = "Chrome";
	String runningOnGrid = "false";
	String hubHost = "0";
	String hubPort = "0";
	
	@BeforeTest
	public void f() {
		try {
			TestCaseBase base = new TestCaseBase();
			base.setUpBrowser(browserFlag, runningOnGrid, hubHost, hubPort);
		} catch (Exception ex) {

		}
	}
	

	@Test(groups = { "ChromeWin32" }, priority = 0)
	public void navigateSearchValidateTopTest() throws Exception {
		XboxGamertagSearchPage xblSearch = new XboxGamertagSearchPage();
		xblSearch.open();
		Assert.assertTrue(xblSearch.titleIs(XboxGamertagSearchPage.TITLE));
	}
	
	@Test(groups = { "ChromeWin32" }, priority = 1)
	public void numOneCheck() throws Exception {
		XboxGamertagSearchPage xblSearch = new XboxGamertagSearchPage();
		xblSearch.open();
		XboxLeaderboardsPage xblLeaderboards = xblSearch.goToLeaderboardsPage();
		Assert.assertTrue(xblLeaderboards.checkOne());
	}
	
	@Test(groups = { "ChromeWin32" }, priority = 2)
	public void numTwoCheck() throws Exception {
		XboxGamertagSearchPage xblSearch = new XboxGamertagSearchPage();
		xblSearch.open();
		XboxLeaderboardsPage xblLeaderboards = xblSearch.goToLeaderboardsPage();
		Assert.assertTrue(xblLeaderboards.checkTwo());
	}
	
	@Test(groups = { "ChromeWin32" }, priority = 3)
	public void numThreeCheck() throws Exception {
		XboxGamertagSearchPage xblSearch = new XboxGamertagSearchPage();
		xblSearch.open();
		XboxLeaderboardsPage xblLeaderboards = xblSearch.goToLeaderboardsPage();
		Assert.assertTrue(xblLeaderboards.checkThree());
	}
	
	@Test(groups = { "ChromeWin32" }, priority = 4)
	public void numFourCheck() throws Exception {
		XboxGamertagSearchPage xblSearch = new XboxGamertagSearchPage();
		xblSearch.open();
		XboxLeaderboardsPage xblLeaderboards = xblSearch.goToLeaderboardsPage();
		Assert.assertTrue(xblLeaderboards.checkFour());
	}
	
	@Test(groups = { "ChromeWin32" }, priority = 5)
	public void numFiveCheck() throws Exception {
		XboxGamertagSearchPage xblSearch = new XboxGamertagSearchPage();
		xblSearch.open();
		XboxLeaderboardsPage xblLeaderboards = xblSearch.goToLeaderboardsPage();
		Assert.assertTrue(xblLeaderboards.checkFive());
	}
	/*
	@AfterTest
	public void closeChrome() {
		TestCaseBase.threadDriver.get().close();
	}*/
}
