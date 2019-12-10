package co.com.bancolombia.certificacion.appinder.stepdefinitions;

import co.com.bancolombia.certificacion.appinder.tasks.IniciarSesion;
import co.com.bancolombia.certificacion.appinder.tasks.RerservarCancha;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.Map;
import net.serenitybdd.screenplay.actors.OnStage;

public class ReservaStepDefinitions extends GeneralStepDefinitions {

  @Before
  public void configuracionInicial() {
    setUp();
  }

  @Dado("^que el usuario inicia la sesion$")
  public void inicioSesion(Map<String, String> credenciales) {
    OnStage.theActorInTheSpotlight().attemptsTo(
        IniciarSesion.enSimonInder(credenciales.get("user"), credenciales.get("password")));
  }

  @Cuando("^el ingresa los datos de la reserva (.*) dia (.*)$")
  public void elIngresaLosDatosDeLaReserva(String fecha, String dia) {
    OnStage.theActorInTheSpotlight().attemptsTo(RerservarCancha.enSimonInder(fecha, dia));
  }

  @Entonces("^el podra ver un mensaje de Felicitaciones$")
  public void elPodraVerUnMensajeDeFelicitaciones() {
  }

}
