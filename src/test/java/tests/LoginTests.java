package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LoginTests extends Base {

    @Test
    public void validLoginTest() {
//        takeScreenshots.takeSnapShot(driver, "BeforeLogin");
        homepage.clickLoginButton();
        loginPage.enterUsername(readData.username);
        loginPage.enterPassword(readData.password);
        loginPage.clickLoginSubmitButton();
        landingPage.verifyLoginSuccess();
        learnPage.clickLearnButton();
        learnPage.clickLearningMaterialsButton();
        learnPage.clickWebAutomationAdvanceButton();
        learnPage.selectDeviceTypePhone();
        learnPage.selectBrand();
        learnPage.selectStorage();
        learnPage.selectColor();
        learnPage.enterQuantity("2");
        learnPage.enterAddress("123 Test Street");
        learnPage.clickNextButton();
        learnPage.selectShippingMethod();
        learnPage.selectWarrantyOption();
        learnPage.enterDiscountCode("SAVE10");
        learnPage.clickApplyDiscountButton();
        learnPage.clickConfirmPurchaseButton();
        learnPage.clickViewInvoiceButton();
        learnPage.verifyInvoiceDisplayed();
        learnPage.clickFinalInvoiceButton();
//        takeScreenshots.takeSnapShot(driver, "AfterLogin");
//        landingPage.clickMenuButton();
//        landingPage.clickLogoutButton();
//        landingPage.acceptAlert();

    }

//    @Test (priority = 2)
//    public void invalidLoginTest(){
//        homepage.clickLoginButton();
//        loginPage.enterUsername("playtest@gmail.com");
//        loginPage.enterPassword("12345");
//        loginPage.clickLoginSubmitButton();
//        takeScreenshots.takeSnapShot(driver, "InvalidLogin");
//
//    }
//
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }


}

