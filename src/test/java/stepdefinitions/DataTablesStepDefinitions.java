package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesStepDefinitions {

    DataTablesPage dataTable = new DataTablesPage();

    @Given("kullanici {string} gider")
    public void kullaniciGider(String string) {
        Driver.getDriver().get(string);
    }

    @When("kullanici new butonuna tiklar")
    public void kullaniciNewButonunaTiklar() {
        dataTable.newBtn.click();
    }

    @When("kullanici first_name {string} girer")
    public void kullanici_first_name_girer(String string) {
        dataTable.firstNameField.sendKeys(string);
    }

    @When("kullanici last_name {string} girer")
    public void kullanici_last_name_girer(String string) {
        dataTable.lastNameField.sendKeys(string);
    }

    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {
        dataTable.positionField.sendKeys(string);
    }

    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {
        dataTable.officeField.sendKeys(string);
    }

    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {
        dataTable.extensionField.sendKeys(string);
    }

    @When("kullanici startdate {string} girer")
    public void kullanici_stardate_girer(String string) {
        dataTable.startDateField.sendKeys(string);
    }

    @When("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {
        dataTable.salaryField.sendKeys(string);
    }

    @And("kullanici create butonuna tiklar")
    public void kullaniciCreateButonunaTiklar() {
        dataTable.createBtn.click();
    }

    @When("kullanici first_name ile {string} ile arar")
    public void kullaniciFirst_nameIleIleArar(String string) {
        dataTable.searchInput.sendKeys(string);
    }

    @Then("kullanici {string} in olustugunu test eder")
    public void kullaniciInOlustugunuTestEder(String string) {
        int count = 0;
        for (WebElement w : dataTable.tableNames) {
            if (w.getText().contains(string)) {
                System.out.println(w.getText());
                count++;
            }
            break;
        }
        Assert.assertEquals(1, count);
    }


}
