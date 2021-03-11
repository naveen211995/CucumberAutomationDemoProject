package com.qa.example.stepDefinitions;

import com.qa.example.pages.HomePage;
import com.qa.example.pages.LoginPage;
import com.qa.example.util.TestBase;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class LoginPageStepDefinition extends TestBase {

    public LoginPage loginPage;
    public HomePage homePage;

    @Given("^User is on Login Page after clicking on SignIn$")
    public void user_is_on_Login_Page_after_clicking_on_SignIn() throws InterruptedException {
        TestBase.initialization();
        Thread.sleep(1000);
        homePage = new HomePage();
        loginPage = homePage.clickOnSignInBtn();
        Assert.assertEquals("Sign in | Tesco.com",loginPage.validate_LoginPageTitle());
    }

    @When("^User enters username and password$")
    public void user_enters_username_and_password() throws InterruptedException {
        loginPage.enterUsername_Password();
    }

    @When("^User clicks on SignIn button$")
    public void user_clicks_on_SignIn_button() throws InterruptedException {
        homePage = loginPage.clickonSignInBtn();
    }

    @Then("^User navigates to HomePage$")
    public void user_navigates_to_HomePage() throws InterruptedException {
        Assert.assertEquals("Tesco - Supermarkets | Online Groceries, Clubcard & Recipes",
                                     homePage.validate_homePageTitle());
        Thread.sleep(1000);
        TestBase.tearDown();
    }

}
