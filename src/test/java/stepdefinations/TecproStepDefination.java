package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class TecproStepDefination {

    @Given("techproeducation sayfasina gidilir")
    public void techproeducation_sayfasina_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
}
    @When("sayfa basligi yazdirilir")
    public void sayfa_basligi_yazdirilir() {
        System.out.println(Driver.getDriver().getTitle());

    }
    @Then("sayfa basliginda Bootcamp yazisi oldugu test edilir")
    public void sayfa_basliginda_bootcamp_yazisi_oldugu_test_edilir() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Bootcamp"));
    }
    @Then("sayfa kapatilir")
    public void sayfa_kapatilir() {
        Driver.closeDriver();

    }

}
