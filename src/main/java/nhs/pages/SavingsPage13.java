package nhs.pages;

import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SavingsPage13 extends Utility {
    private static final Logger log = LogManager.getLogger(SavingsPage13.class.getName());

    public SavingsPage13() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement nosavaing;
    @CacheLookup
    @FindBy(xpath = "//input[@class='button']")
    WebElement nextbuttonforsaving;


    public void clickOnSavingInvestInProperty() {
        clickOnElement(nosavaing);
        log.info("Clicking on no " + nosavaing.toString());
    }
    public void clickOnNextOfSaving() {
        clickOnElement(nextbuttonforsaving);
        log.info("Clicking on next " + nextbuttonforsaving.toString());
    }
}
