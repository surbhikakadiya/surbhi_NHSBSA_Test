package nhs.pages;

import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnerPage6 extends Utility
{
    private static final Logger log = LogManager.getLogger(PartnerPage6.class.getName());

    public PartnerPage6() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement partneroption;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonforpartner;

    public void clickonLiveWithPartner() {
        clickOnElement(partneroption);
        log.info("Clicking on my yes " + partneroption.toString());
    }

    public void clickOnNextButtonOfPartnerOption() {
        clickOnElement(nextbuttonforpartner);
        log.info("Clicking on next " + nextbuttonforpartner.toString());
    }
}
