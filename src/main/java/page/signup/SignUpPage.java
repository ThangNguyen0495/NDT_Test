package page.signup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static links.Paths.URL;

public class SignUpPage {
    WebDriver driver;
    SignUpElement element;
    WebDriverWait wait;

    public SignUpPage (WebDriver driver) {
        this.driver = driver;
        element = new SignUpElement(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public SignUpPage navigate() {
        driver.get(URL);
        return this;
    }

    public SignUpPage inputEmail(String email) {
        element.EMAIL_SIGNUP.sendKeys(email);
        return this;
    }

    public SignUpPage clickTermCheckbox() {
        String scripts = "arguments[0].click();";
        ((JavascriptExecutor) driver).executeScript(scripts, element.TERM_CHECKBOX);
        return this;
    }

    public void clickNextBtn() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(element.NEXT_BTN));
        element.NEXT_BTN.click();
        sleep(10000);
    }
}
