package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {
    GooglePage googlePage = new GooglePage();

    @Given("kullanici Google'a gider")
    public void kullanici_google_a_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }

    @When("kullanici iphone kelimesini aratir")
    public void kullanici_iphone_kelimesini_aratir() {
        googlePage.googleSearchBar.sendKeys("iPhone" + Keys.ENTER);
    }

    @Then("sonucun iphone içerdiğini dogrular")
    public void sonucun_iphone_icerdiğini_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @When("kullanici_tesla_kelimesini_aratir")
    public void kullanici_tesla_kelimesini_aratir() {
        googlePage.googleSearchBar.sendKeys("tesla" + Keys.ENTER);
    }

    @Then("sonucun tesla oldugunu dogrular")
    public void sonucun_tesla_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tesla"));
    }

    @When("kullanici {string} kelimesini aratir")
    public void kullanici_kelimesini_aratir(String string) {
        googlePage.googleSearchBar.sendKeys(string + Keys.ENTER);
    }

    @Then("sonucun {string} içerdiğini dogrular")
    public void sonucun_içerdiğini_dogrular(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().equals(string + "1111"));
    }

}
