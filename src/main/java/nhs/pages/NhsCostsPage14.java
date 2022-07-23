package nhs.pages;

import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NhsCostsPage14 extends Utility {
    private static final Logger log = LogManager.getLogger(NhsCostsPage14.class.getName());

    public NhsCostsPage14() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[@id='result-heading']")
    WebElement verifyresult;

    public String VerifyResultMsg() {
        log.info("Verify Text displaye on page " + verifyresult.toString());
        return getTextFromElement(verifyresult);
    }
}
