package xbox.basepages;

import org.testng.annotations.Test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.FunctionUtil;
import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;

public class XboxLeaderboardsPage extends Page {
	public static String TITLE = "Gamerscore Leaderboards - Xbox Gamertag";
	public static String URL = "https://www.xboxgamertag.com/leaderboards";
	
	@FindBy(xpath = "//a[contains(@class,'navbar-brand text-weight-bold')]")
	public WebElement load_page_link;
	
	@FindBy(xpath = "(//a[@class='display-4 stretched-link'])[1]")
	public WebElement numOne;
	
	@FindBy(xpath = "(//a[@class='display-4 stretched-link'])[3]")
	public WebElement numTwo;
	
	@FindBy(xpath = "(//a[@class='display-4 stretched-link'])[5]")
	public WebElement numThree;
	
	@FindBy(xpath = "(//a[@class='display-4 stretched-link'])[7]")
	public WebElement numFour;
	
	@FindBy(xpath = "(//a[@class='display-4 stretched-link'])[9]")
	public WebElement numFive;
	
	public boolean checkOne() {
		Waiting.until(numOne);
		String name = numOne.getText();
		Properties PROPERTIES_RESOURCES = SystemUtil
                .loadPropertiesResources("/testdata_xboxLeader.properties");
		return name.equals(PROPERTIES_RESOURCES.getProperty("xboxLeader.one"));
	}
	
	public boolean checkTwo() {
		Waiting.until(numTwo);
		String name = numTwo.getText();
		Properties PROPERTIES_RESOURCES = SystemUtil
                .loadPropertiesResources("/testdata_xboxLeader.properties");
		return name.equals(PROPERTIES_RESOURCES.getProperty("xboxLeader.two"));
	}
	
	public boolean checkThree() {
		Waiting.until(numThree);
		String name = numThree.getText();
		Properties PROPERTIES_RESOURCES = SystemUtil
                .loadPropertiesResources("/testdata_xboxLeader.properties");
		return name.equals(PROPERTIES_RESOURCES.getProperty("xboxLeader.three"));
	}
	
	public boolean checkFour() {
		Waiting.until(numFour);
		String name = numFour.getText();
		Properties PROPERTIES_RESOURCES = SystemUtil
                .loadPropertiesResources("/testdata_xboxLeader.properties");
		return name.equals(PROPERTIES_RESOURCES.getProperty("xboxLeader.four"));
	}
	
	public boolean checkFive() {
		Waiting.until(numFive);
		String name = numFive.getText();
		Properties PROPERTIES_RESOURCES = SystemUtil
                .loadPropertiesResources("/testdata_xboxLeader.properties");
		return name.equals(PROPERTIES_RESOURCES.getProperty("xboxLeader.five"));
	}
	
	public XboxLeaderboardsPage waitPageLoad() throws InterruptedException {
		
		if (FunctionUtil.isExist(load_page_link)) {
			Waiting.until(load_page_link,5000);
		} else if (FunctionUtil.isExist(numOne)) {
			Waiting.until(numOne,5000);
		} else if (FunctionUtil.isExist(numTwo)) {
			Waiting.until(numTwo,5000);
		} else if (FunctionUtil.isExist(numThree)) {
			Waiting.until(numThree,5000);
		} 		
		
		return this;
	}
}
