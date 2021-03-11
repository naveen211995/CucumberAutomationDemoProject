package com.qa.example.pages;

import com.qa.example.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensClothingPage extends TestBase {

    @FindBy(xpath="//span[contains(text(), 'Explore Men')]")
    WebElement exploreMensNewLink;

    public MensClothingPage(){
        PageFactory.initElements(driver, this);
    }

    public String validate_MensClothingPageTitle(){
        return driver.getTitle();
    }

    public ExploreMensNewPage navigateToExploreMensNewLink(){
        exploreMensNewLink.click();
        return new ExploreMensNewPage();
    }
}
