package inji.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class TrustedDigitalWalletPage extends BasePage {

    @AndroidFindBy(accessibility = "introTitle")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Trusted Digital Wallet\"`]")
    private WebElement trustedDigitalWalletText;

    @AndroidFindBy(accessibility = "introText")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,'Store and carry')]")
    private WebElement trustedDigitalWalletDescription;

    @AndroidFindBy(accessibility = "next")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Next\"`][4]")
    private WebElement nextButton;

    public TrustedDigitalWalletPage(AppiumDriver driver) {
        super(driver);
    }

    public boolean isTrustedDigitalWalletPageLoaded() {
        return this.isElementDisplayed(trustedDigitalWalletText);
    }
    
    public boolean isTrustedDigitalWalletPageLoadedInFilipino() {
        return this.isElementDisplayed(trustedDigitalWalletText);
    }
    
    public boolean isTrustedDigitalWalletPageLoadedInHindi() {
        return this.isElementDisplayed(trustedDigitalWalletText);
    }
    
    public boolean isTrustedDigitalWalletPageLoadedInTamil() {
        return this.isElementDisplayed(trustedDigitalWalletText);
    }
    
    public boolean isTrustedDigitalWalletPageLoadedInKannada() {
        return this.isElementDisplayed(trustedDigitalWalletText);
    }

    public String getTrustedDigitalWalletDescription() {
        return this.getTextFromLocator(trustedDigitalWalletDescription);
    }

    public AppUnlockMethodPage clickOnNextButton() {
        this.clickOnElement(nextButton);
        return new AppUnlockMethodPage(driver);
    }

}
