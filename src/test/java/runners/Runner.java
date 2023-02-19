package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features", //features folder path
        glue = "stepdefinitions", //stepdefinitions path
        tags = "@iPhone or @tesla"
)
public class Runner {

}

//Bu sinif Test case'leri RUN etmek icin kullanilir.
//Ve konfigurasyonlar icin kullanilir.
