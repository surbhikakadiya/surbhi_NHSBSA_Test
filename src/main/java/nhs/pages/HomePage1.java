package nhs.pages;


import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Shruti
 */
public class HomePage1 extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage1.class.getName());

    public HomePage1() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='nhsuk-cookie-banner__link_accept_analytics']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement startButton;


    public void clickOnCookies() {
        clickOnElement(acceptCookies);
        log.info("Clicking on start accept cookies" + acceptCookies.toString());
    }

    public void clickOnStartButton() {
        clickOnElement(startButton);
        log.info("Clicking on start Button" + startButton.toString());
    }
}
