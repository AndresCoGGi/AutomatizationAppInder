package co.com.bancolombia.certificacion.appinder.interactions;

import co.com.bancolombia.certificacion.appinder.userinterface.RegistroElementos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarEnLista implements Interaction {

  private Target campo;
  private String option;

  public SeleccionarEnLista(String option, Target campo) {
    this.campo = campo;
    this.option = option;
  }

  public static SeleccionarEnLista opcion(String opcion, Target campo) {
    return Tasks.instrumented(SeleccionarEnLista.class, opcion, campo);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    System.out.println();
    actor.attemptsTo(Click.on(campo), Click.on(RegistroElementos.OPCION_LISTA.of(option)));
  }
}
