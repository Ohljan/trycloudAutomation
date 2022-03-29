package com.trycloud.step_definitions;

import com.trycloud.pages.AddFav;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.ModulesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class US5_StepDefs {



    AddFav addFav = new AddFav();


    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {addFav.UserClicksOnFile.click();
        //BrowserUtils.sleep(3);
    }

    @When("the user clicks action-icon from any file on the page And user choose the {string} option")
    public void the_user_clicks_action_icon_from_any_file_on_the_page_and_user_choose_the_option(String string) {addFav.ClicksFavoriteIcon.click();
       // BrowserUtils.sleep(3);
    }
    @When("user click the {string} sub-module on the left side Then Verify the chosen file is listed on the table")
    public void user_click_the_sub_module_on_the_left_side_then_verify_the_chosen_file_is_listed_on_the_table(String string) {addFav.VerifyFaveFiles.click();
        BrowserUtils.sleep(3);
    }


}
