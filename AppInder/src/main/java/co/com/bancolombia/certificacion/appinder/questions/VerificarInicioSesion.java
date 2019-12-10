package co.com.bancolombia.certificacion.appinder.questions;

import co.com.bancolombia.certificacion.appinder.userinterface.HomeElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarInicioSesion implements Question<Boolean> {

  private String nombre;

  public VerificarInicioSesion(String nombre) {
    this.nombre = nombre;
  }

  public static VerificarInicioSesion exitoso(String nombre){
    return new VerificarInicioSesion(nombre);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return Text.of(HomeElements.INCIO_SESION_EXITOSO).viewedBy(actor).asString().contains(nombre);
  }
}
