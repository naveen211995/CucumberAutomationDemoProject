package com.qa.example.pages;

import com.qa.example.util.TestBase;
import org.openqa.selenium.support.PageFactory;

public class ExploreMensNewPage extends TestBase {



    public ExploreMensNewPage(){
        PageFactory.initElements(driver, this);
    }

    public String validate_ExploreMensNewPageTitle(){
        return driver.getTitle();
    }
}
