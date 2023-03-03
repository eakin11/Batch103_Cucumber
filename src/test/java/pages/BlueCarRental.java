package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueCarRental {

    public BlueCarRental() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement firstLoginBtn;

    @FindBy(id = "formBasicEmail")
    public WebElement usernameInput;

    @FindBy(id = "formBasicPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement secondLoginBtn;

    @FindBy(id = "dropdown-basic-button")
    public WebElement usernameDropdown;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement userNotFoundAlert;

    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement logOutButton;

    @FindBy(xpath = "//*[@class='ajs-button ajs-ok']")
    public WebElement logOutAcceptButton;


}
