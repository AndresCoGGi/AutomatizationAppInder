package co.com.bancolombia.certificacion.appinder.stepdefinitions;

import static co.com.bancolombia.certificacion.appinder.util.Constantes.REGISTRO_EXITOSO;

import co.com.bancolombia.certificacion.appinder.model.UsuarioInder;
import co.com.bancolombia.certificacion.appinder.questions.VerificarRegistro;
import co.com.bancolombia.certificacion.appinder.tasks.IrHastaRegistro;
import co.com.bancolombia.certificacion.appinder.tasks.RegistrarUsuario;
import co.com.bancolombia.certificacion.appinder.util.drivers.MyDriver;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RegistroUsuarioStepDefinitions {

  Actor actor;

  @Dado("^que el usuario se encuentra en el formulario de registro$")
  public void queElUsuarioSeEncuentraEnElFormularioDeRegistro() {
    actor = Actor.named("Andres");
    actor
        .can(BrowseTheWeb.with(MyDriver.web().inThePage("https://simon.inder.gov.co/admin/login")));
    actor.wasAbleTo(IrHastaRegistro.deUsuario());
  }

  @Cuando("^el ingresa los datos personales$")
  public void elIngresaLosDatosPersonales(List<UsuarioInder> datosUsuario) {
    actor.attemptsTo(RegistrarUsuario.conDatos(datosUsuario));

  }

  @Entonces("^el podra registrar exitosamente$")
  public void elPodraRegistrarExitosamente() {
    actor.should(GivenWhenThen.seeThat(VerificarRegistro.exitoso(REGISTRO_EXITOSO)));
  }

}
