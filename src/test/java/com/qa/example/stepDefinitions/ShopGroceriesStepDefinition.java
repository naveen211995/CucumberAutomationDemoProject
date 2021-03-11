package com.qa.example.stepDefinitions;

import com.qa.example.pages.HomePage;
import com.qa.example.pages.LoginPage;
import com.qa.example.pages.ShopGroceries;
import com.qa.example.util.TestBase;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class ShopGroceriesStepDefinition extends TestBase{

    public HomePage homePage;
    public LoginPage loginPage;
    public ShopGroceries shopGroceries;

    @Given("^User logs into the application$")
    public void user_logs_into_the_application() throws InterruptedException {
        TestBase.initialization();
        Thread.sleep(1000);
        homePage = new HomePage();
        loginPage = homePage.clickOnSignInBtn();
        loginPage.enterUsername_Password();
        homePage = loginPage.clickonSignInBtn();
        shopGroceries = homePage.navigateTo_shopGroceriesPage();
        Assert.assertEquals("Tesco Groceries - Online food shopping - Grocery delivery - Tesco Groceries",
                shopGroceries.validateShopGroceriesPageTitle());
    }

    @Then("^User searches the product$")
    public void user_searches_the_product() throws InterruptedException {
        shopGroceries.searchTheProduct();
        Assert.assertEquals("Results for “milk”", shopGroceries.validateSearchProductHeading());
    }

    @Then("^User adds the required product and checksout$")
    public void user_adds_the_required_product_and_checksout() throws InterruptedException {
        shopGroceries.addSearchedProductAndCheckout();
        Thread.sleep(1000);
        Assert.assertEquals("Book a slot", shopGroceries.validateCheckoutPageHeading());
        TestBase.tearDown();
    }
}
