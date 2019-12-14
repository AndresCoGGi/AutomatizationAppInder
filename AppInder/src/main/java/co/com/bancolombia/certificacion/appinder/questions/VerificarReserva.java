package co.com.bancolombia.certificacion.appinder.questions;

import static co.com.bancolombia.certificacion.appinder.userinterface.ReservaElements.ACEPTAR_RESERVA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.bancolombia.certificacion.appinder.userinterface.ReservaElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class VerificarReserva implements Question<String> {

  public static VerificarReserva exitosa() {
    return new VerificarReserva();
  }

  @Override
  public String answeredBy(Actor actor) {
    actor.attemptsTo(WaitUntil.the(ReservaElements.INBOX_FELICITACIONES, isVisible()));
    String textoFelicitaciones = Text.of(ReservaElements.MENSAJE_FELICITACIONES).viewedBy(actor)
        .asString();
    actor.attemptsTo(Click.on(ACEPTAR_RESERVA));
    return textoFelicitaciones;
  }
}
