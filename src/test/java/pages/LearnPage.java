package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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


    public LearnPage(WebDriver driver) {
        this.driver = driver;
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
        quantityInput.clear(); // Clears out any existing number (like "0")
        quantityInput.sendKeys(quantity); // Types your desired quantity
    }

}
