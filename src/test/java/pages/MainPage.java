package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = "//*[@id='language-bar']")
    public SelenideElement languageBar;

    @FindBy(xpath = "//button[@data-wt-label='Accept all cookies']")
    public SelenideElement acceptAllCookiesButton;

    @FindBy(xpath = "//*[@wtlabel='ENG']//span[text()='EN']")
    public SelenideElement switchToEnglishButton;

    @FindBy(xpath = "//*[text()='Loan, leasing']")
    public SelenideElement mainMenuLoanLeasingButton;

    @FindBy(xpath = "//*[text()='Small loan']")
    public SelenideElement smallLoanSubMenu;

    @Step("Set language to English")
    public void setLanguage () {
        acceptAllCookiesButton.click();
        languageBar.click();
        switchToEnglishButton.click();
    }

    @Step("Go to small loan page")
    public void goToSmallLoanPage () {
        mainMenuLoanLeasingButton.click();
        smallLoanSubMenu.click();
    }
}
