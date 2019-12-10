package co.com.bancolombia.certificacion.appinder.questions;

import co.com.bancolombia.certificacion.appinder.userinterface.RegistroElementos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarRegistro implements Question<Boolean> {

  private String mensaje;

  public VerificarRegistro(String mensaje) {
    this.mensaje = mensaje;
  }

  public static VerificarRegistro exitoso(String mensaje) {
    return new VerificarRegistro(mensaje);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return Text.of(RegistroElementos.MENSAJE_EXITOSO).viewedBy(actor).asString().contains(mensaje);
  }
}
