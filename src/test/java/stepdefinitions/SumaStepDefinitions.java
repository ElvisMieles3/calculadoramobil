package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;


public class SumaStepDefinitions {

    @Managed
    private WebDriver mydriver;

    @Before
    public void start(){
        OnStage.setTheStage(new Cast());
    }

    @Given("^que (.*) usa la calculadora")
    public void queUsaLaCalculadora(String usuario) throws MalformedURLException {

    }

    @When("^suma los numeros (.*) y (.*)$")
    public void sumaLosNumeros(String numero1, String numero2) {
    }

    @Then("^podra ver el resultado igual a (.*)$")
    public void podraVerElResultadoIgualA(String resultado) {
    }

    @When("^resta los numeros (.*) y (.*)$")
    public void restaLosNumerosY(String numero1, String numero2) {
    }

    @When("^multiplica los numeros (.*) y (.*)$")
    public void multiplicaLosNumerosY(String numero1, String numero2) {
    }

}
