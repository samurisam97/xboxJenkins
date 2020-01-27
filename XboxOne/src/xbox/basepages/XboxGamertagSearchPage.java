package xbox.basepages;

import org.testng.annotations.Test;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.FunctionUtil;
import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;

public class XboxGamertagSearchPage extends Page {
	public static String TITLE = "Xbox Gamertag";
	public static String URL = "https://xboxgamertag.com";
	
	@FindBy(xpath = "//a[contains(@class,'navbar-brand text-weight-bold')]")
	public WebElement load_page_link;
	
	@FindBy(xpath = "(//a[@class='nav-link'])[4]")
	public WebElement leaderboards;
	
	@FindBy(xpath = "//input[@class='form-control mr-sm-2']")
	public WebElement searchBarInput;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-outline-success')]")
	public WebElement searchSubmit;
	
	public XboxGamertagSearchPage open() throws Exception {
		Properties PROPERTIES_RESOURCES = SystemUtil
                .loadPropertiesResources("/testdata_xbox.properties");
		String URL = PROPERTIES_RESOURCES.getProperty("xbox.url");
		TestCaseBase.threadDriver.get().navigate().to(URL);

		return this;
	}
	
	public XboxLeaderboardsPage goToLeaderboardsPage() {
		Waiting.until(leaderboards, 5000);
		leaderboards.click();
		
		return new XboxLeaderboardsPage();
	}
	
	public XboxDuskamoPage goToSearch() throws Exception {
		Waiting.until(searchSubmit, 5000);
		
		Properties PROPERTIES_RESOURCES = SystemUtil
                .loadPropertiesResources("/testdata_xboxDuskamo.properties");
		
		searchBarInput.sendKeys(PROPERTIES_RESOURCES.getProperty("xboxDuskamo.gamertag"));
		
		searchSubmit.click();
		return new XboxDuskamoPage();
	}
	
	
	public XboxGamertagSearchPage waitPageLoad() throws InterruptedException {
		//Thread.sleep(2000);
		//Waiting.implicitly(2);
		
		if (FunctionUtil.isExist(load_page_link)) {
			Waiting.until(load_page_link,5000);
		} else if (FunctionUtil.isExist(leaderboards)) {
			Waiting.until(leaderboards,5000);
		} else if (FunctionUtil.isExist(searchBarInput)) {
			Waiting.until(searchBarInput,5000);
		} else if (FunctionUtil.isExist(searchSubmit)) {
			Waiting.until(searchSubmit,5000);
		} 		
		
		return this;
	}
}
