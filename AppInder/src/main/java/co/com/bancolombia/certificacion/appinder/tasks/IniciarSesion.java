package co.com.bancolombia.certificacion.appinder.tasks;

import co.com.bancolombia.certificacion.appinder.interactions.SeleccionarEnLista;
import co.com.bancolombia.certificacion.appinder.userinterface.HomeElements;
import co.com.bancolombia.certificacion.appinder.util.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

  private String user;
  private String password;

  public IniciarSesion(String user, String password) {
    this.user = user;
    this.password = password;
  }

  public static IniciarSesion enSimonInder(String user, String password) {
    return Tasks.instrumented(IniciarSesion.class, user, password);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SeleccionarEnLista.opcion(Constantes.TIPO_DOCUMENTO_PASAPORTE, HomeElements.TIPO_DOCUMENTO),
        Enter.theValue(user).into(HomeElements.NUMERO_DOCUMENTO),
        Enter.theValue(password).into(HomeElements.CONTRASENIA),
        Click.on(HomeElements.BTN_ENTRAR));
    actor.remember("USUARIO", user);
  }
}
