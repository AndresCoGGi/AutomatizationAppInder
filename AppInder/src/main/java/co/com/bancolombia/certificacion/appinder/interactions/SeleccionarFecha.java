package co.com.bancolombia.certificacion.appinder.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.bancolombia.certificacion.appinder.userinterface.ReservaElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SeleccionarFecha implements Interaction {

  private String dia;
  private String mes;

  public SeleccionarFecha(String dia, String mes) {
    this.dia = dia;
    this.mes = mes;
  }

  public static SeleccionarFecha deReserva(String dia, String mes) {
    return instrumented(SeleccionarFecha.class, dia, mes);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(ReservaElements.FECHA_INICIO_INPUT));
    while (!ReservaElements.MES_LABEL.of(mes).resolveFor(actor).isVisible()) {
      actor.attemptsTo(WaitUntil.the(ReservaElements.BTN_NEXT, isEnabled()),
          Click.on(ReservaElements.BTN_NEXT));
    }
    actor.attemptsTo(Click.on(ReservaElements.DIA.of(dia)));
  }
}
