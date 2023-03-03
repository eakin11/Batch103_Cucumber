package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueCarRental;
import utilities.Driver;

public class BlueCarRentalStepDefinitions {

    BlueCarRental blueCarRental = new BlueCarRental();

    @When("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        blueCarRental.firstLoginBtn.click();
    }

    @When("kullanici email {string} alanina datayi girer")
    public void kullanici_email_alanina_datayi_girer(String string) {
        blueCarRental.usernameInput.sendKeys(string);
    }

    @When("kullanici password {string} alanina datayi girer")
    public void kullanici_password_alanina_datayi_girer(String string) {
        blueCarRental.passwordInput.sendKeys(string);
    }

    @When("kullanici mavi login butonuna tiklar")
    public void kullanici_mavi_login_butonuna_tiklar() {
        blueCarRental.secondLoginBtn.click();
    }

    @Then("kullanici ismini {string} ekranda gorundugunu dogrular")
    public void kullanici_ismini_ekranda_gorundugunu_dogrular(String string) {
        Assert.assertEquals(string, blueCarRental.usernameDropdown.getText());
    }

    @Then("kullanici user not found uyarisinin ekranda gorundugunu dogrular")
    public void kullanici_user_not_found_uyarisinin_ekranda_gorundugunu_dogrular() {
        //Driver.waitForVisibility(blueCarRental.userNotFoundAlert, 3);
        Assert.assertTrue(blueCarRental.userNotFoundAlert.isDisplayed());
    }


}
