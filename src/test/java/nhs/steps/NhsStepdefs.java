package nhs.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nhs.pages.*;
import org.junit.Assert;

public class NhsStepdefs {
    @Given("^I am on home page of NHS\\.$")
    public void iAmOnHomePageOfNHS() {
    }

    @When("^I click on accpet cookies\\.$")
    public void iClickOnAccpetCookies() {
        new HomePage1().clickOnCookies();
    }

    @And("^I click on start button\\.$")
    public void iClickOnStartButton() {
        new HomePage1().clickOnStartButton();
    }

    @And("^I select my country\\.$")
    public void iSelectMyCountry(){
        new CountryPage2().clickOnWhichCountryToLiveIn();
    }

    @And("^I click on country's nextbutton\\.$")
    public void iClickOnCountrySNextbutton() {
        new CountryPage2().clickOnNextButtonOfCountry();}

    @And("^I select my GP Practice\\.$")
    public void iSelectMyGPPractice(){
        new GpPracticePage3().clickOnGPService();
    }

    @And("^I click on GP Practice's next button\\.$")
    public void iClickOnGPPracticeSNextButton() {
        new GpPracticePage3().clickOnNextButtonOfGpService();
    }

    @And("^I select my Dental Practice\\.$")
    public void iSelectMyDentalPractice(){
        new DentalPracticePage4().clickOnDentalPractice();
    }

    @And("^I click on dental practice next button\\.$")
    public void iClickOnDentalPracticeNextButton(){
        new DentalPracticePage4().clickOnNextButtonOfDentalPractice();
    }

    @And("^I enter my Date Of Birth\\.$")
    public void iEnterMyDateOfBirth() {
        new DateOfBirthPage5().setDate("1");
    }

    @And("^I enter my month Of Birth\\.$")
    public void iEnterMyMonthOfBirth(){
        new DateOfBirthPage5().setMonth("02");
    }

    @And("^I enter my year Of Birth\\.$")
    public void iEnterMyYearOfBirth(){
        new DateOfBirthPage5().setYear("2000");
    }

    @And("^I click on date of birth option's next button\\.$")
    public void iClickOnDateOfBirthOptionSNextButton(){
        new DateOfBirthPage5().clickOnNextButtonOfDateOfBirth();
    }

    @And("^I select live with a partner\\.$")
    public void iSelectLiveWithAPartner(){
        new PartnerPage6().clickonLiveWithPartner();
    }

    @And("^I click on live with a partner option's next button\\.$")
    public void iClickOnLiveWithAPartnerOptionSNextButton() {
      new PartnerPage6().clickOnNextButtonOfPartnerOption();
    }

    @And("^I select me or my partner is not claim any benefits or tax credits\\.$")
    public void iSelectMeOrMyPartnerIsNotClaimAnyBenefitsOrTaxCredits() {
        new TexCreditPage7().clickOnClaimBebefirOrTax();
    }

    @And("^I click on benefits or tax credits option'snext button\\.$")
    public void iClickOnBenefitsOrTaxCreditsOptionSnextButton() {
        new TexCreditPage7().clickOnNextButtonOfCredit();
    }

    @And("^I select option no for my pregnant or have you given birth in the last (\\d+) months\\.$")
    public void iSelectOptionNoForMyPregnantOrHaveYouGivenBirthInTheLastMonths(int arg0) {
        new BirthPage8().clickOnPragnentOrGivenBirth();
    }
    @And("^I click on pregnaice option's next button$")
    public void iClickOnPregnaiceOptionSNextButton(){
        new BirthPage8().clickOnNextButtonOfPregnacy();
    }

    @And("^I select i dont have any injury or illness caused by serving in the armed forces\\.$")
    public void iSelectIDontHaveAnyInjuryOrIllnessCausedByServingInTheArmedForces() {
        new ArmedForcesPage9().clickOnInjuryOrIllness();
    }

    @And("^I click on injury's next button$")
    public void iClickOnInjurySNextButton(){
        new ArmedForcesPage9().clickOnNextButtonOfNoArmedForce();
    }

    @And("^I select i dont have diabetes\\.$")
    public void iSelectIDontHaveDiabetes() {
        new DiabetesPage10().clickOnDiabities();
    }

    @And("^I click on diabetes option's next button$")
    public void iClickOnDiabetesOptionSNextButton() {
        new DiabetesPage10().clickOnNextButtonOfDiabities();
    }

    @And("^I select i dont have glaucoma\\.$")
    public void iSelectIDontHaveGlaucoma() {
        new GlaucomaPage11().clickOnGlucoma();
    }

    @And("^I click on glaucoma option's next button$")
    public void iClickOnGlaucomaOptionSNextButton() {
        new GlaucomaPage11().clickOnNextOfGlucoma();
    }

    @And("^I click on I or my partner do not live permenentely in a care home\\.$")
    public void iClickOnIOrMyPartnerDoNotLivePermenentelyInACareHome() {
        new PermenentelyCareHome12().clickOncareHomePermenetely();
    }
    @And("^I click on live permenentely in a care home option'snext button for live permenentely in a care home$")
    public void iClickOnLivePermenentelyInACareHomeOptionSnextButtonForLivePermenentelyInACareHome() {
        new PermenentelyCareHome12().clickOnnextbuttonforPermenentelyCareHome();
    }
    @And("^I select my and my partner have not more than £(\\d+),(\\d+) in savings, investments or property\\.$")
    public void iSelectMyAndMyPartnerHaveNotMoreThan£InSavingsInvestmentsOrProperty(int arg0, int arg1) {
        new SavingsPage13().clickOnSavingInvestInProperty();
    }

    @And("^I click on savings and investments options's next button$")
    public void iClickOnSavingsAndInvestmentsOptionsSNextButton(){
        new SavingsPage13().clickOnNextOfSaving();
    }

    @Then("^I get a final result of whether I will get help or not$")
    public void iGetAFinalResultOfWhetherIWillGetHelpOrNot() {
        Assert.assertEquals("Not Getting help","Based on what you've told us\n" +
                "You get help with NHS costs",new NhsCostsPage14().VerifyResultMsg());
    }
}
