package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {
    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='My Learning']")
    WebElement myLearningTab;

    @FindBy(xpath = "//span[normalize-space()='Learn']")
    WebElement learnTab;

    @FindBy(xpath = "//span[normalize-space()='Learning Materials']")
    WebElement learningMaterialsTab;

    @FindBy(xpath = "//span[normalize-space()='Web Automation Advance']")
    WebElement webAutomationAdvanceTab;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginSuccess() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(myLearningTab));
        myLearningTab.isDisplayed();

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

}
