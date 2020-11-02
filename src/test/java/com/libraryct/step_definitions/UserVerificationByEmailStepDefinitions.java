package com.libraryct.step_definitions;

import com.libraryct.pages.UserVerificationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserVerificationByEmailStepDefinitions {

    UserVerificationPage userVerificationPage = new UserVerificationPage();


    @Then("user clicks on users tab section")
    public void user_clicks_on_users_tab_section() {
       userVerificationPage.selectUserModule();
    }




    @When("user enters a user's e-mail to search bar")
    public void user_enters_a_user_s_e_mail_to_search_bar() {
        userVerificationPage.enterEmailAddress();
    }


    @Then("user should see a user is selected")
    public void user_should_see_a_user_is_selected() {
       userVerificationPage.verifyUserSelected();
    }
}
