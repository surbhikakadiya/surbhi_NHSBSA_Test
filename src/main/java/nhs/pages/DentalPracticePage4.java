package nhs.pages;

import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DentalPracticePage4 extends Utility{
    private static final Logger log = LogManager.getLogger(DentalPracticePage4.class.getName());
    public DentalPracticePage4() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-wales']")
    WebElement walesDentalPractices;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonDentalPractices;

    // Click on Dental practice
    public void clickOnDentalPractice() {
        clickOnElement(walesDentalPractices);
        log.info("Clicking on wales  " + walesDentalPractices.toString());
    }

    public void clickOnNextButtonOfDentalPractice(){
        clickOnElement(nextbuttonDentalPractices);
        log.info("Clicking on next " + nextbuttonDentalPractices.toString());
    }
}
