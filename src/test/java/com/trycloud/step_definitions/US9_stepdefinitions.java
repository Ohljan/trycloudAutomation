package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US9_stepdefinitions {
    FilesPage filesPage=new FilesPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        filesPage.files.click();
    }
    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        filesPage.actionIcon.click();
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        filesPage.details.click();
    }
    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
    filesPage.comments.click();
    filesPage.message.sendKeys("good job");
    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
    filesPage.post.click();
    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        String actualText = filesPage.seePost.getText();
        String expectedText="good job";
        Assert.assertEquals(expectedText,actualText);

    }
}
