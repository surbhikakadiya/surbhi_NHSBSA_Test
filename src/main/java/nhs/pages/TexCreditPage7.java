package nhs.pages;

import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TexCreditPage7 extends Utility {
    private static final Logger log = LogManager.getLogger(TexCreditPage7.class.getName());

    public TexCreditPage7() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement noTextCredit;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonfortexcredit;

    public void clickOnClaimBebefirOrTax() {
        clickOnElement(noTextCredit);
        log.info("Clicking on no " + noTextCredit.toString());
    }
    public void clickOnNextButtonOfCredit() {
        clickOnElement(nextbuttonfortexcredit);
        log.info("Clicking on next " + nextbuttonfortexcredit.toString());
    }
}
