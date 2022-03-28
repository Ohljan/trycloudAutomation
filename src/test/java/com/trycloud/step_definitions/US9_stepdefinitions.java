package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US9_stepdefinitions {
    FilesPage filesPage=new FilesPage();

    @Given("user on the dashboard pageS")
    public void user_on_the_dashboard_pageS() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
    @When("the user clicks the {string} moduleS")
    public void the_user_clicks_the_moduleS(String string) {
        filesPage.files.click();
    }
    @When("user click action-icon  from any file on the pageS")
    public void user_click_action_icon_from_any_file_on_the_pageS() {
        filesPage.actionIcon.click();
    }
    @When("user choose the {string} optionS")
    public void user_choose_the_optionS(String string) {
        filesPage.details.click();
    }
    @When("user write a comment inside the input boxS")
    public void user_write_a_comment_inside_the_input_boxS() {
    filesPage.comments.click();
    filesPage.message.sendKeys("good job");
    }
    @When("user click the submit button to post itS")
    public void user_click_the_submit_button_to_post_itS() {
    filesPage.post.click();
    }
    @Then("Verify the comment is displayed in the comment sectionS.")
    public void verify_the_comment_is_displayed_in_the_comment_sectionS() {
        String actualText = filesPage.seePost.getText();
        String expectedText="good job";
        Assert.assertEquals(expectedText,actualText);

    }
}
