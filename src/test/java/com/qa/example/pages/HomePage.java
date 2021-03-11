package com.qa.example.pages;

import com.qa.example.util.TestBase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    //PageFactory
    @FindBy(xpath="//span[@class='link-text' and text()='Sign in']")
    WebElement signInBtn;

    @FindBy(xpath="//h1[@class='tag']")
    WebElement pageLogo;

    @FindBy(xpath="//a[@title='Groceries']")
    WebElement groceriesLink;

    @FindBy(xpath="//a[contains(@href, 'groceriesshopgroceries')]")
    WebElement shopGroceriesLink;

    @FindBy(xpath="//a[@title='F&F Clothing']")
    WebElement FFClothingLink;

    @FindBy(xpath="//span[contains(text(), 'Browse men')]")
    WebElement browseMensClothingLink;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String validate_homePageTitle(){
        return driver.getTitle();
    }

    public String validate_homePageLogo(){
        return pageLogo.getText();
    }

    public LoginPage clickOnSignInBtn(){
        signInBtn.click();
        return new LoginPage();

    }

    public ShopGroceries navigateTo_shopGroceriesPage() throws InterruptedException {
        Thread.sleep(2000);
        groceriesLink.click();
        Thread.sleep(1000);
        shopGroceriesLink.click();
        return new ShopGroceries();
    }

    public MensClothingPage clickon_BrowseMensClothingLink(){
        FFClothingLink.click();
        browseMensClothingLink.click();
        return new MensClothingPage();
    }

}
