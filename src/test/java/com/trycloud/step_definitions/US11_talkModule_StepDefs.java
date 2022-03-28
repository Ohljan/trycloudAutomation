package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.TalkModulePage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US11_talkModule_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        loginPage.login();
    }

    TalkModulePage talkModulePage = new TalkModulePage();

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        talkModulePage.talkModule.click();
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Trycloud"));
    }

    @When("user search user from the search box")
    public void user_search_user_from_the_search_box() {
        talkModulePage.userSearchBox.sendKeys("user100");
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(talkModulePage.userFind).perform();
        talkModulePage.userFind.click();
    }



    @When("user write a message")
    public void user_write_a_message() {
        talkModulePage.messageBox.sendKeys("Hello, how are you?");
    }

    @When("user clicks to submit button")
    public void user_clicks_to_submit_button() {
        talkModulePage.submitMessageBtn.click();
    }

    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {
        Assert.assertTrue(talkModulePage.messageDisplayed.isDisplayed());


    }

}
