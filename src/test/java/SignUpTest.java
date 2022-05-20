import driver.InitWebdriver;
import dummy.Generate;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page.signup.SignUpPage;
import page.verication_mail.VerificationMailPage;
import page.wait_verification_page.VerificationPage;

public class SignUpTest {

    @Test
    public void test() throws InterruptedException {
        String email = (Generate.generateHalfWidthString(50) + "@dmxs8.com").toLowerCase();
        WebDriver driver = new InitWebdriver().getWebdriver("chrome", "false");
        SignUpPage signUp = new SignUpPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);
        VerificationMailPage verificationMailPage = new VerificationMailPage(driver);
        signUp.navigate()
                .inputEmail(email)
                .clickTermCheckbox()
                .clickNextBtn();
        verificationPage.clickChangeEmailLink();
        signUp.inputEmail(email)
                .clickTermCheckbox()
                .clickNextBtn();
        verificationMailPage.navigate(email)
                .openURL();
    }
}
