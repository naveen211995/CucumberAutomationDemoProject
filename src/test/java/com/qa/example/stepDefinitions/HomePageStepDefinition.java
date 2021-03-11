package com.qa.example.stepDefinitions;

import com.qa.example.pages.HomePage;
import com.qa.example.pages.LoginPage;
import com.qa.example.util.TestBase;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class HomePageStepDefinition extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @Given("^User opens the browser$")
    public void user_opens_the_browser() throws InterruptedException {
        TestBase.initialization();
        Thread.sleep(1000);
        homePage = new HomePage();
        Assert.assertEquals("Tesco - Supermarkets | Online Groceries, Clubcard & Recipes",
                                     homePage.validate_homePageTitle());
    }

    @Then("^User is on Login Page$")
    public void user_is_on_Login_Page() {
        Assert.assertEquals("Tesco", homePage.validate_homePageLogo());
    }

    @Then("^User clicks on Sign In link$")
    public void user_clicks_on_Sign_In_link() throws InterruptedException {
        loginPage = homePage.clickOnSignInBtn();
        Thread.sleep(2000);
        Assert.assertEquals("Sign in | Tesco.com", loginPage.validate_LoginPageTitle());
        TestBase.tearDown();
    }

}
