package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.net.MalformedURLException;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import questions.Validar;
import tasks.Division;
import tasks.Multiplicacion;
import tasks.Resta;
import tasks.Sumar;
import ui.ElementosPage;

public class OperacionesStepDefinitions {

    @Managed
    private WebDriver mydriver;

    @Before
    public void start(){
        OnStage.setTheStage(new Cast());
    }

    @Given("^que (.*) usa la calculadora")
    public void queUsaLaCalculadora(String usuario) throws MalformedURLException {
        OnStage.theActorCalled(usuario);
        theActorInTheSpotlight().can(BrowseTheWeb.with(mydriver));
    }

    @When("^suma los numeros (.*) y (.*)$")
    public void sumaLosNumeros(String numero1, String numero2) {
        theActorInTheSpotlight().attemptsTo(Sumar.losNumeros(numero1, numero2));
    }

    @Then("^podra ver el resultado igual a (.*)$")
    public void podraVerElResultadoIgualA(String resultado) {
    	theActorInTheSpotlight().should(seeThat(Validar.elTexto(ElementosPage.RESULTADO), Matchers.equalTo(resultado)));
    }

    @When("^resta los numeros (.*) y (.*)$")
    public void restaLosNumerosY(String numero1, String numero2) {
        theActorInTheSpotlight().attemptsTo(Resta.losNumeros(numero1, numero2));
    }

    @When("^multiplica los numeros (.*) y (.*)$")
    public void multiplicaLosNumerosY(String numero1, String numero2) {
        theActorInTheSpotlight().attemptsTo(Multiplicacion.losNumeros(numero1, numero2));
    }

    @When("^Divide los numeros (.*) y (.*)$")
    public void divideLosNumerosY(String numero1, String numero2) {
        theActorInTheSpotlight().attemptsTo(Division.losNumeros(numero1, numero2));
    }

}
