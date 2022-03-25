package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactsIcon;

    @FindBy(xpath = "//a[@data-original-title='Details']")
    public WebElement contactDetailsLink;
}
