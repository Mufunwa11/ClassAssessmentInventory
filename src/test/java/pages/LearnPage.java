package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LearnPage {
    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Learn']")
    WebElement learnTab;

    @FindBy(xpath = "//span[normalize-space()='Learning Materials']")
    WebElement learningMaterialsTab;

    @FindBy(xpath = "//span[normalize-space()='Web Automation Advance']")
    WebElement webAutomationAdvanceTab;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropdown;

    @FindBy(id = "brand")
    WebElement brandDropdown;

    @FindBy(xpath = "//span[normalize-space()='128GB']")
    WebElement storageOption;

    @FindBy(id = "color")
    WebElement colorSelection;

    @FindBy(id = "quantity")
    WebElement quantityInput;

    @FindBy(id = "address")
    WebElement addressField;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    WebElement nextButton;

    @FindBy(id = "shipping-option-express")
    WebElement shippingMethod;

    @FindBy(id = "warranty-option-1yr")
    WebElement warrantyOption;

    @FindBy(id = "discount-code")
    WebElement discountCodeField;

    @FindBy(xpath = "//button[normalize-space()='Apply']")
    WebElement applyDiscountButton;

    @FindBy(xpath = "//button[normalize-space()='Confirm Purchase']")
    WebElement confirmPurchaseButton;

    @FindBy(xpath = "//button[normalize-space()='View Invoice']")
    WebElement viewInvoiceButton;

    @FindBy(xpath = "//button[starts-with(@id, 'view-invoice-')]")
    WebElement finalInvoiceButton;

    public LearnPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLearnButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(learnTab));
        learnTab.click();
    }

    public void clickLearningMaterialsButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(learningMaterialsTab));
        learningMaterialsTab.click();
    }

    public void clickWebAutomationAdvanceButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(webAutomationAdvanceTab));
        webAutomationAdvanceTab.click();
    }

    public void selectDeviceTypePhone() {
        Select select = new Select(deviceTypeDropdown);
        select.selectByVisibleText("Phone");
    }

    public void selectBrand() {
        Select select = new Select(brandDropdown);
        select.selectByVisibleText("Apple");
    }

    public void selectStorage() {
        storageOption.click();
    }

    public void selectColor() {
        Select select = new Select(colorSelection);
        select.selectByVisibleText("Blue");
    }

    public void enterQuantity(String quantity) {
        quantityInput.clear();
        quantityInput.sendKeys(quantity);
    }

    public void enterAddress(String address) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(addressField));
        addressField.sendKeys(address);
    }

    public void clickNextButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(nextButton));
        nextButton.click();
    }

    public void selectShippingMethod() {
        shippingMethod.click();
    }

    public void selectWarrantyOption() {
        warrantyOption.click();
    }

    public void enterDiscountCode(String discountCode) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(discountCodeField));
        discountCodeField.sendKeys(discountCode);
    }

    public void clickApplyDiscountButton() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(applyDiscountButton));
        applyDiscountButton.click();
    }

    public void clickConfirmPurchaseButton() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(confirmPurchaseButton));
        confirmPurchaseButton.click();
    }

    public void clickViewInvoiceButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(viewInvoiceButton));
        viewInvoiceButton.click();
    }

    public void verifyInvoiceDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(finalInvoiceButton));
        Assert.assertTrue(finalInvoiceButton.isDisplayed(), "Final invoice document view button is not displayed.");
    }

    public void clickFinalInvoiceButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(finalInvoiceButton));
        finalInvoiceButton.click();
    }
}