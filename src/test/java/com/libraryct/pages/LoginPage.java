package com.libraryct.pages;

import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage()  {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement email;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement signIn;

    public void login() {
    email.sendKeys(ConfigurationReader.getProperty("libraryUser"));
    password.sendKeys(ConfigurationReader.getProperty("libraryPassword"));
    signIn.click();
    }
}

