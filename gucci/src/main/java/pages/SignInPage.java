package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/25/17.
 */
public class SignInPage {

    @FindBy(id = "j_username")
    public WebElement usernameBox;

    @FindBy(id = "j_password")
    public WebElement passwordBox;

    @FindBy(css = ".alert.negative")
    public WebElement errorMessage;

    @FindBy(css = "#loginPageForm .sign-button")
    public WebElement signInButton;

    public WebElement getUsernameBox() {
        return usernameBox;
    }

    public WebElement getPasswordBox() {
        return passwordBox;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public void login(String username, String password) {
        getUsernameBox().sendKeys(username);
        getPasswordBox().sendKeys(password);
        getSignInButton().click();
    }

    public String getErrorMessageText() {
        return getErrorMessage().getText();
    }
}
