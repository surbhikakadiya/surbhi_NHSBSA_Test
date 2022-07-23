package nhs.pages;

import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountryPage2 extends Utility {
    private static final Logger log = LogManager.getLogger(CountryPage2.class.getName());

    public CountryPage2() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-wales']")
    WebElement wales;

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement countrynext;

    public void clickOnWhichCountryToLiveIn() {
        clickOnElement(wales);
        log.info("Clicking on wales" + wales.toString());
    }

    public void clickOnNextButtonOfCountry() {
        clickOnElement(countrynext);
        log.info("Clicking on next" + countrynext.toString());
    }

}
