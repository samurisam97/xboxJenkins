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

public class XboxDuskamoPage extends Page {
	public static String TITLE = "SAMARISAM97 - Xbox Gamertag";
	public static String URL = "https://www.xboxgamertag.com/search/Duskamo";

	@FindBy(xpath = "(//a[@href='/'])[1]")
	public WebElement load_page_link;

	@FindBy(xpath = "(//div[@class='game-card-desc']//a)[1]")
	public WebElement gameOne;

	@FindBy(xpath = "(//div[@class='game-card-desc']//a)[2]")
	public WebElement gameTwo;

	@FindBy(xpath = "(//div[@class='game-card-desc']//a)[3]")
	public WebElement gameThree;

	@FindBy(xpath = "(//div[@class='game-card-desc']//a)[4]")
	public WebElement gameFour;

	public XboxDuskamoPage waitPageLoad() throws InterruptedException {
		Waiting.until(gameOne, 5000);

		return this;
	}
	
	public boolean gamesCheck() {
		Properties PROPERTIES_RESOURCES = SystemUtil
                .loadPropertiesResources("/testdata_xboxDuskamo.properties");
		return (gameOne.getText().equals(PROPERTIES_RESOURCES.getProperty("xboxDuskamo.gameOne")) &&
				gameTwo.getText().equals(PROPERTIES_RESOURCES.getProperty("xboxDuskamo.gameTwo")) &&
				gameThree.getText().equals(PROPERTIES_RESOURCES.getProperty("xboxDuskamo.gameThree")) &&
				gameFour.getText().equals(PROPERTIES_RESOURCES.getProperty("xboxDuskamo.gameFour")) );
	}
}
