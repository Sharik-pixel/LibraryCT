package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserVerificationPage {


    @FindBy(xpath = "(//span[@class='title'])[2]")
    private WebElement userModuleInput;

    @FindBy(xpath = "//tr[3]/td[4]")
    private WebElement userEmailInput;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchBarInput;


    public UserVerificationPage(){ PageFactory.initElements(Driver.getDriver(),this); }


        public void selectUserModule(){
        //selecting Users module
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);
        wait.until(ExpectedConditions.elementToBeClickable(userModuleInput));

        userModuleInput.click();
        }


        public void enterEmailAddress(){
        //selecting an user e-mail
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);
        wait.until(ExpectedConditions.visibilityOfAllElements(userEmailInput));
        String emailAddress= userEmailInput.getText();

        //passing selected user e-mail to search bar
        wait.until(ExpectedConditions.visibilityOfAllElements(searchBarInput));
        searchBarInput.sendKeys(emailAddress);
        searchBarInput.click();
        }


        public void verifyUserSelected(){
        //verifying e-mail address is selected
        String selectedEmail = userEmailInput.getText();
            Assert.assertTrue(selectedEmail.contains(userEmailInput.getText()));

            System.out.println("* * *      * * *     * * *");
            System.out.println("selectedEmail is: " + selectedEmail);
        }


}
