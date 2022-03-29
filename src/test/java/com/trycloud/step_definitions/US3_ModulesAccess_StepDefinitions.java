package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.ModulesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US3_ModulesAccess_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    ModulesPage modulesPage = new ModulesPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        //  loginPage.login(); -> allows me to combine 2 steps
        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
    }

    @When("the users log in with the valid credentials")
    public void the_users_log_in_with_the_valid_credentials() {
        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("username1"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.submitButton.click();

    }

    @Then("verify the users see the following modules")
    public void verify_the_users_see_the_following_modules(List<String> expectedModules) {

        List<String> actualModules = new ArrayList<>();

        for (WebElement each : modulesPage.mainModules) {
            BrowserUtils.hover(each);
            actualModules.add(each.getText());
        }

        Assert.assertEquals(expectedModules, actualModules);
    }
    }

