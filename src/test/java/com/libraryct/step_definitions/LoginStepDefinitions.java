package com.libraryct.step_definitions;

import com.libraryct.pages.LoginPage;
import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user on login page for library application")
    public void user_on_login_page_for_library_application() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }

    @Then("user enters {string} and password and clicks login button")
    public void user_enters_and_and_clicks_login_button(String username) {
       loginPage.login();

        System.out.println("SAMPLE TEST GITHUB");

      }


}
