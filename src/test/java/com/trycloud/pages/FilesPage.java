package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {
    public  FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//li)[2]")
    public WebElement files;

    @FindBy(xpath = "(//span[@class='fileactions']//span)[3]")
    public WebElement actionIcon;

  @FindBy(xpath = "//*[.='Details']")
    public  WebElement details;

  @FindBy(xpath = "//span[@class='app-sidebar-tabs__tab-icon icon-comment']")
  public WebElement comments;

  @FindBy(xpath = "//div[@class='message']")
  public WebElement message;

  @FindBy(xpath = "(//input[@type='submit'])[2]")
  public WebElement post;

  @FindBy(xpath = "(//div[.='good job'])[2]")
  public WebElement seePost;


}
