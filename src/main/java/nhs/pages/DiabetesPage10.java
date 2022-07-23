package nhs.pages;

import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiabetesPage10 extends Utility {
    private static final Logger log = LogManager.getLogger(DiabetesPage10.class.getName());

    public DiabetesPage10() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement nodiabetes;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttondiabetest;

    public void clickOnDiabities() {
        clickOnElement(nodiabetes);
        log.info("Clicking on no " + nodiabetes.toString());
    }
    public void clickOnNextButtonOfDiabities() {
        clickOnElement(nextbuttondiabetest);
        log.info("Clicking on next " + nextbuttondiabetest.toString());
    }
}
