package nhs.pages;

import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArmedForcesPage9 extends Utility {
    private static final Logger log = LogManager.getLogger(ArmedForcesPage9.class.getName());

    public ArmedForcesPage9() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement  force;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonforarmedforce;

    //injury or illlness
    public void clickOnInjuryOrIllness() {
        clickOnElement(force);
        log.info("Clicking on no " + force.toString());
    }
    public void clickOnNextButtonOfNoArmedForce() {
        clickOnElement(nextbuttonforarmedforce);
        log.info("Clicking on next " + nextbuttonforarmedforce.toString());
    }
}
