Feature:Eligibility Checker

  As user i like to know what help I can get with my NHS costs

  Scenario: Wales Test Ticket - Acceptance Criteria
    Given I am on home page of NHS.
    When  I click on accpet cookies.
    And   I click on start button.
    And   I select my country.
    And   I click on country's nextbutton.
    And   I select my GP Practice.
    And   I click on GP Practice's next button.
    And   I select my Dental Practice.
    And   I click on dental practice next button.
    And   I enter my Date Of Birth.
    And   I enter my month Of Birth.
    And   I enter my year Of Birth.
    And   I click on date of birth option's next button.
    And   I select live with a partner.
    And   I click on live with a partner option's next button.
    And   I select me or my partner is not claim any benefits or tax credits.
    And   I click on benefits or tax credits option'snext button.
    And   I select option no for my pregnant or have you given birth in the last 12 months.
    And   I click on pregnaice option's next button
    And   I select i dont have any injury or illness caused by serving in the armed forces.
    And   I click on injury's next button
    And   I select i dont have diabetes.
    And   I click on diabetes option's next button
    And   I select i dont have glaucoma.
    And   I click on glaucoma option's next button
    And   I click on I or my partner do not live permenentely in a care home.
    And   I click on live permenentely in a care home option'snext button for live permenentely in a care home
    And   I select my and my partner have not more than £16,000 in savings, investments or property.
    And   I click on savings and investments options's next button
    Then  I get a final result of whether I will get help or not
