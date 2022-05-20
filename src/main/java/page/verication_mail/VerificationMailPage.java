package page.verication_mail;

import common.tabs.HandleMultipleTabs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static links.Paths.GENERATE_EMAIL_TEST_URL;

public class VerificationMailPage {
    WebDriver driver;
    VerificationMailElement verificationMailElement;
    HandleMultipleTabs tabs;
    WebDriverWait wait;

    public VerificationMailPage(WebDriver driver) {
        this.driver = driver;
        verificationMailElement = new VerificationMailElement(driver);
        tabs = new HandleMultipleTabs(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public VerificationMailPage navigate(String email) {
        tabs.openURLOnNewTab(GENERATE_EMAIL_TEST_URL + email, 1);
        return this;
    }

    public String getURL() {
        wait.until(ExpectedConditions.visibilityOf(verificationMailElement.LIST_MAIL.get(1))).click();
        String URL = verificationMailElement.MAIL_CONTENT.getText().split("to confirm")[1];
        System.out.println(URL);
        tabs.closeTab();
        return URL;
    }

    public void openURL() {
        tabs.openURLOnNewTab(getURL(), 1);
    }
}
