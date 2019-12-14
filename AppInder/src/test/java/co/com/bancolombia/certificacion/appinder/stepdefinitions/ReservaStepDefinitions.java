package co.com.bancolombia.certificacion.appinder.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import co.com.bancolombia.certificacion.appinder.questions.VerificarReserva;
import co.com.bancolombia.certificacion.appinder.tasks.IniciarSesion;
import co.com.bancolombia.certificacion.appinder.tasks.RerservarCancha;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.Map;

public class ReservaStepDefinitions extends GeneralStepDefinitions {

  @Before
  public void configuracionInicial() {
    setUp();
  }

  @Dado("^que el usuario inicia la sesion$")
  public void inicioSesion(Map<String, String> credenciales) {
    theActorInTheSpotlight().attemptsTo(
        IniciarSesion.enSimonInder(credenciales.get("user"), credenciales.get("password"), credenciales.get("tipo_documento")));
  }

  @Cuando("^el ingresa los datos de la reserva (.*) dia (.*)$")
  public void elIngresaLosDatosDeLaReserva(String fecha, String dia) {
    theActorInTheSpotlight().attemptsTo(RerservarCancha.enSimonInder(fecha, dia));
  }

  @Entonces("^el podra ver un mensaje de (.*)$")
  public void elPodraVerUnMensaje(String mensaje) {
    theActorInTheSpotlight().should(seeThat(VerificarReserva.exitosa(), is(mensaje)));
  }

}
