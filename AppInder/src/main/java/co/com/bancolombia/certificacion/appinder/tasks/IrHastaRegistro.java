package co.com.bancolombia.certificacion.appinder.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.bancolombia.certificacion.appinder.userinterface.HomeElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IrHastaRegistro implements Task {

  public static IrHastaRegistro deUsuario() {
    return Tasks.instrumented(IrHastaRegistro.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(HomeElements.BTN_REGISTRO, isVisible()),
        Click.on(HomeElements.BTN_REGISTRO));
  }
}
