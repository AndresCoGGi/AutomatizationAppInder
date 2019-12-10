package co.com.bancolombia.certificacion.appinder.stepdefinitions;

import static co.com.bancolombia.certificacion.appinder.util.Constantes.NOMBRE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import co.com.bancolombia.certificacion.appinder.questions.VerificarInicioSesion;
import co.com.bancolombia.certificacion.appinder.tasks.IniciarSesion;
import co.com.bancolombia.certificacion.appinder.util.Constantes;
import co.com.bancolombia.certificacion.appinder.util.drivers.MyDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class InicioSesionStepDefinitions {

  Actor actor;

  @Given("^el usuario se encuentra en la pagina principal del inder$")
  public void elUsuarioSeEncuentraEnLaPaginaPrincipalDelInder() {
    actor = Actor.named("Andres");
    actor.can(BrowseTheWeb.with(MyDriver.web().inThePage("https://simon.inder.gov.co/admin/login")));
  }

  @When("^el ingresa los datos de autenticacion$")
  public void elIngresaLosDatosDeAutenticacion() {
      //actor.attemptsTo(IniciarSesion.enSimonInder());
  }

  @Then("^el iniciara sesion exitosamente$")
  public void elIniciaraSesionExitosamente() {
    actor.should(seeThat(VerificarInicioSesion.exitoso(NOMBRE)));

  }

}
