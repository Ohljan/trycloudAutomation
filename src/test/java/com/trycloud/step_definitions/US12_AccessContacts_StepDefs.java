package com.trycloud.step_definitions;

import com.trycloud.pages.ContactsPage;
import com.trycloud.pages.LoginPage;

import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_AccessContacts_StepDefs {
    ContactsPage contactsPage = new ContactsPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
      new LoginPage().login();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

contactsPage.contactsIcon.click();
contactsPage.contactDetailsLink.click();

    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        Assert.assertEquals(string,Driver.getDriver().getTitle());
    }

}
