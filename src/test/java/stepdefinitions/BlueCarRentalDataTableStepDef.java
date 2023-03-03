package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import pages.BlueCarRental;

import java.util.List;
import java.util.Map;

public class BlueCarRentalDataTableStepDef {

    BlueCarRental blueCarRental = new BlueCarRental();

    @When("kullanici email ve sifre girer")
    public void kullanici_email_ve_sifre_girer(DataTable dataTable) {
//        // 1. List<String> olarak datalari depolayabiliriz
//        List<String> dataTableList = dataTable.row(1);
//        blueCarRental.usernameInput.sendKeys(dataTableList.get(0));
//        blueCarRental.passwordInput.sendKeys(dataTableList.get(1));
        //2. List<Map<String, String>> olarak datalari depolayabiliriz
        List<Map<String, String>> dataTableMapList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> w : dataTableMapList) {
            blueCarRental.usernameInput.sendKeys(w.get("email"));
            blueCarRental.passwordInput.sendKeys(w.get("sifre"));
        }

    }

}
