package com.qa.example.pages;

import com.qa.example.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //PageFactory
    @FindBy(xpath="//input[@id='username']")
    WebElement usernameTxtBox;

    @FindBy(xpath="//input[@id='password']")
    WebElement passwordTxtBox;

    @FindBy(xpath="//span[text()='Sign in']")
    WebElement signInBtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public String validate_LoginPageTitle(){
        return driver.getTitle();
    }

    public void enterUsername_Password() throws InterruptedException {
        usernameTxtBox.sendKeys(prop.getProperty("username"));
        Thread.sleep(1000);
        passwordTxtBox.sendKeys(prop.getProperty("password"));
        Thread.sleep(1000);
    }

    public HomePage clickonSignInBtn() throws InterruptedException {
        Thread.sleep(1000);
        signInBtn.click();
        return new HomePage();
    }


}
