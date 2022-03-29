package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upLoadPage {
   public upLoadPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
    @FindBy(xpath="//button[@class='settings-button opened']")
    public WebElement SettingButton;

    @FindBy(css = "#appmenu li[data-id='files'] svg")
    public WebElement elementSvg;

    @FindBy(css = ".settings-button")
    public WebElement settingsbutton;

    @FindBy(css = "label[for='showRichWorkspacesToggle']")// first check box
    public WebElement elementLabel;

    @FindBy(xpath = "//label[text()='Show recommendations']")//second check box
    public WebElement elementLabel2;

    @FindBy(css = "label[for='select_all_files']")
    public WebElement elementLabel3;


    @FindBy(css = "label[for='showhiddenfilesToggle']")
    public WebElement elementLabel6;
}
