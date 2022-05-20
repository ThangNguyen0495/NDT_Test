package page.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpElement {
    WebDriver driver;

    public SignUpElement (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name = 'email']")
    WebElement EMAIL_SIGNUP;

    @FindBy(css = "div.form-check > label")
    WebElement TERM_CHECKBOX;

    @FindBy(css = "#btn-submit")
    WebElement NEXT_BTN;
}
