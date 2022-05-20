package page.verication_mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VerificationMailElement {
    WebDriver driver;

    public VerificationMailElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "div.from_div_45g45gg")
    List<WebElement> LIST_MAIL;

    @FindBy(css = "div[class *= 'mess_bodiyy']")
    WebElement MAIL_CONTENT;
}
