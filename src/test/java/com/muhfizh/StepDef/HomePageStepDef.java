package com.muhfizh.StepDef;

import com.muhfizh.Base;
import com.muhfizh.Page.HomePage;
import io.cucumber.java.en.Then;

public class HomePageStepDef extends Base {

    HomePage homePage;

    @Then("user masuk ke halaman utama")
    public void TampilanUtama() {
        homePage = new HomePage(driver);
        homePage.validasihomepage();
    }
}
