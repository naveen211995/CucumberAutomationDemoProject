package com.qa.example.pages;

import com.qa.example.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopGroceries extends TestBase {

    @FindBy(xpath="//input[@id='search-input']")
    WebElement searchBar;

    @FindBy(xpath="//button[@class='search-bar__submit icon-search-white']")
    WebElement searchBtn;

    @FindBy(xpath="//h1[@class='heading query']")
    WebElement searchedProductHeading;

    @FindBy(xpath="(//button[@class='button small add-control button-secondary'])[1]")
    WebElement productAddBtn;

    @FindBy(xpath="//a[@class='button button-primary mini-trolley__checkout']")
    WebElement checkoutBtn;

    @FindBy(xpath="//h1[text()='Book a slot']")
    WebElement checkoutPageHeading;

    public ShopGroceries(){
        PageFactory.initElements(driver, this);
    }

    public String validateShopGroceriesPageTitle(){
        return driver.getTitle();
    }

    public void searchTheProduct() throws InterruptedException {
        Thread.sleep(1000);
        searchBar.sendKeys(prop.getProperty("product"));
        Thread.sleep(1000);
        searchBtn.click();
        Thread.sleep(1000);
    }

    public String validateSearchProductHeading(){
        return searchedProductHeading.getText();
    }

    public void addSearchedProductAndCheckout() throws InterruptedException {
        productAddBtn.click();
        Thread.sleep(2000);
        checkoutBtn.click();
        Thread.sleep(1000);
    }

    public String validateCheckoutPageHeading(){
        return checkoutPageHeading.getText();
    }
}
