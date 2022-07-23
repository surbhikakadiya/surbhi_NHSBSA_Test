package nhs.pages;

import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlaucomaPage11 extends Utility {
    private static final Logger log = LogManager.getLogger(GlaucomaPage11.class.getName());

    public GlaucomaPage11() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement noglaucoma;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonforglaucoma;

    public void clickOnGlucoma() {
        clickOnElement(noglaucoma);
        log.info("Clicking on no " + noglaucoma.toString());
    }
    public void clickOnNextOfGlucoma() {
        clickOnElement(nextbuttonforglaucoma);
        log.info("Clicking on next " + nextbuttonforglaucoma.toString());
    }

}
