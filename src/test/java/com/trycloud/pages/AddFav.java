package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFav {


    public AddFav() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//ul[@id='appmenu']//a[@href='/index.php/apps/files/']")
    public  WebElement UserClicksOnFile;

    @FindBy(xpath = "//div[@id='app-navigation']/ul[@class='with-icon']/li[3]/a[@href='#']")
    public WebElement ClicksFavoriteIcon;

    @FindBy(xpath = "//div[@id='app-content-favorites']/table[@id='filestable']/tbody[@id='fileList']//span[@class='fileactions']/a[2]/span[@class='icon icon-more']")
    public  WebElement VerifyFaveFiles;
}