package page.wait_verification_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationElement {
    WebDriver driver;
    public VerificationElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#resend-email")
    WebElement RESEND_VERIFICATION_MAIL;

    @FindBy(css = "p.pt40 > a")
    WebElement CHANGE_EMAIL;

    @FindBy(css = "p.pt25 > a")
    WebElement NAVIGATE_TO_LOGIN_PAGE;
}
