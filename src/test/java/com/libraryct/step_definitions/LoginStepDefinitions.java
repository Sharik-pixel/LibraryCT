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

       loginPage.login( "email",  "password");

  //  username  = username.toLowerCase();
    //  switch (username){
    //      case "library":
     //         Driver.getDriver().findElement(By.id("inputEmail")).sendKeys(ConfigurationReader.getProperty("libraryUser"));
     //         Driver.getDriver().findElement(By.id("inputPassword")).sendKeys(ConfigurationReader.getProperty("libraryPassword"));
     //         Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();


      }

    @Then("user clicks on user tab section")
    public void user_clicks_on_user_tab_section() {

     //   WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
     //   WebElement usersTab = Driver.getDriver().findElement(By.xpath("//a[@href='#users']/span[1]"));
     //   wait.until(ExpectedConditions.elementToBeClickable(usersTab));
     //   usersTab.click();

    }
}
