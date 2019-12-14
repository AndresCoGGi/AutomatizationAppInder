package co.com.bancolombia.certificacion.appinder.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.appinder.interactions.SeleccionarEnLista;
import co.com.bancolombia.certificacion.appinder.userinterface.HomeElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

  private String user;
  private String password;
  private String tipoDocumento;

  public IniciarSesion(String user, String password, String tipoDocumento) {
    this.user = user;
    this.password = password;
    this.tipoDocumento = tipoDocumento;
  }

  public static IniciarSesion enSimonInder(String user, String password, String tipoDocumento) {
    return instrumented(IniciarSesion.class, user, password, tipoDocumento);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SeleccionarEnLista.opcion(tipoDocumento, HomeElements.TIPO_DOCUMENTO),
        Enter.theValue(user).into(HomeElements.NUMERO_DOCUMENTO),
        Enter.theValue(password).into(HomeElements.CONTRASENIA),
        Click.on(HomeElements.BTN_ENTRAR));
    actor.remember("USUARIO", user);
  }
}
