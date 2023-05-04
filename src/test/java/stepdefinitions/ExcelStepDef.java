package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.BlueCarRental;
import utilities.Driver;
import utilities.ExcelUtils;

import java.util.List;
import java.util.Map;

public class ExcelStepDef {

    ExcelUtils excelUtils = new ExcelUtils("src/test/resources/testdata/mysmoketestdata.xlsx", "customer_info");
    BlueCarRental blueCarRental = new BlueCarRental();

    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String string) {
        List<Map<String, String>> dataList = excelUtils.getDataList();
        for (Map<String, String> w : dataList) {
            Driver.getDriver().get("https://www.bluerentalcars1.com/");
            blueCarRental.firstLoginBtn.click();
            blueCarRental.usernameInput.sendKeys(w.get("username"));
            blueCarRental.passwordInput.sendKeys(w.get("password"));
            blueCarRental.secondLoginBtn.click();
            blueCarRental.usernameDropdown.click();
            Driver.sleep(1);
            blueCarRental.logOutButton.click();
            Driver.sleep(1);
            blueCarRental.logOutAcceptButton.click();
        }
        Driver.closeDriver();
    }

}
