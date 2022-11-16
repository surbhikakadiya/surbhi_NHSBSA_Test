package nhs.pages;

import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BirthPage8 extends Utility

{
    private static final Logger log = LogManager.getLogger(BirthPage8.class.getName());

    public BirthPage8() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement nopregnantcy;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonforbirthpage;

    //Pragnent given birth
    public void clickOnPragnentOrGivenBirth() {
        clickOnElement(nopregnantcy);
        log.info("Clicking on no " + nopregnantcy.toString());
    }
    public void clickOnNextButtonOfPregnacy() {
        clickOnElement(nextbuttonforbirthpage);
        log.info("Clicking on next " + nextbuttonforbirthpage.toString());
    }

    public static void main(String[] args) {
        System.out.println("1 may");
    }
}
