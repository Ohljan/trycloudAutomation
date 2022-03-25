package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

        public LoginPage() {
                PageFactory.initElements(Driver.getDriver(),this);
        }


        @FindBy(id = "user")
        public WebElement userNameInput;

        @FindBy(id = "password")
        public WebElement passwordInput;

        @FindBy(id = "submit-form")
        public WebElement submitButton;

        public void login(){
                Driver.getDriver().get(ConfigurationReader.getProperty("env"));
                userNameInput.sendKeys(ConfigurationReader.getProperty("username1"));
                passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
                submitButton.click();
        }
}
