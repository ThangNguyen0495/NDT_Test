package page.wait_verification_page;

import org.openqa.selenium.WebDriver;

public class VerificationPage {
    WebDriver driver;
    VerificationElement verifyElement;

    public VerificationPage(WebDriver driver) {
        this.driver = driver;
        verifyElement = new VerificationElement(driver);
    }

    public VerificationPage clickResendBtn () {
        verifyElement.RESEND_VERIFICATION_MAIL.click();
        return this;
    }

    public VerificationPage clickChangeEmailLink() {
        verifyElement.CHANGE_EMAIL.click();
        return this;
    }

    public void clickNavigateToLoginPageLink() {
        verifyElement.NAVIGATE_TO_LOGIN_PAGE.click();
    }
}
