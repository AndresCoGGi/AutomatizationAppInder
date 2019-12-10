package co.com.bancolombia.certificacion.appinder.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.bancolombia.certificacion.appinder.interactions.SeleccionarEnLista;
import co.com.bancolombia.certificacion.appinder.interactions.SeleccionarFecha;
import co.com.bancolombia.certificacion.appinder.userinterface.ReservaElements;
import co.com.bancolombia.certificacion.appinder.util.DiaSemanaUtility;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RerservarCancha implements Task {

  private String fecha;
  private String diaSemana;

  public RerservarCancha(String fecha, String diaSemana) {
    this.fecha = fecha;
    this.diaSemana = diaSemana;
  }

  public static RerservarCancha enSimonInder(String fecha, String diaSemana) {
    return instrumented(RerservarCancha.class, fecha, diaSemana);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    Boolean disponible = false;
    String[] partesFecha = fecha.split("-");
    String dia = partesFecha[0];
    String mes = partesFecha[1];
    actor.attemptsTo(Click.on(ReservaElements.ESCENARIOS_DEPORTIVOS),
        Click.on(ReservaElements.RESERVA),
        WaitUntil.the(ReservaElements.AGREGAR_NUEVO, isVisible()),
        Click.on(ReservaElements.AGREGAR_NUEVO),
        SeleccionarEnLista.opcion("Girardot - Castilla", ReservaElements.BARRIO),
        WaitUntil.the(ReservaElements.LOADER, isNotVisible()),
        WaitUntil.the(ReservaElements.ESCENARIO_DEPORTIVO, isEnabled()),
        SeleccionarEnLista.opcion(
            "CANCHA DE MICROFUTBOL EN GRAMA SINTETICA N.1 UNIDAD DEPORTIVA JUANES DE LA PAZ",
            ReservaElements.ESCENARIO_DEPORTIVO),
        WaitUntil.the(ReservaElements.DISCIPLINA_CHECKBOX, isVisible()),
        Click.on(ReservaElements.DISCIPLINA_CHECKBOX),
        WaitUntil.the(ReservaElements.DISCIPLINA_CAMPO, isEnabled()),
        SeleccionarEnLista.opcion("MICROFUTBOL", ReservaElements.DISCIPLINA_CAMPO));
    do {
      actor.attemptsTo(SeleccionarFecha.deReserva(dia, mes),
          SeleccionarEnLista.opcion("Tarde", ReservaElements.JORNADA),
          Scroll.to(ReservaElements.HORA_INICIO.of(DiaSemanaUtility.obtenerDiaSemana(diaSemana))),
          WaitUntil
              .the(ReservaElements.HORA_INICIO.of(DiaSemanaUtility.obtenerDiaSemana(diaSemana)),
                  isVisible()),
          Enter.theValue("2000")
              .into(ReservaElements.HORA_INICIO.of(DiaSemanaUtility.obtenerDiaSemana(diaSemana))),
          Enter.theValue("2100")
              .into(ReservaElements.HORA_FIN.of(DiaSemanaUtility.obtenerDiaSemana(diaSemana))),
          Click.on(ReservaElements.DISPONIBILIDAD));
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      //WaitUntil.the(ReservaElements.ADVERTENCIA, isCurrentlyVisible()).forNoMoreThan(10).seconds());
      if (ReservaElements.ADVERTENCIA.resolveFor(actor).isCurrentlyVisible()) {
        actor.attemptsTo(Click.on(ReservaElements.BTN_OK_ADVERTENCIA));
        dia = String.valueOf(Integer.parseInt(dia) + 1);
      } else {
        disponible = true;
      }
      diaSemana = DiaSemanaUtility.aumentarDia(diaSemana);
    } while (!disponible);
    actor.attemptsTo(WaitUntil.the(ReservaElements.BTN_GUARDAR_CONTINUAR, isVisible()),
        Click.on(ReservaElements.BTN_GUARDAR_CONTINUAR));
    //PAGE 2
    actor.attemptsTo(WaitUntil.the(ReservaElements.UBICACION_COMPLETA, isVisible()),
        Click.on(ReservaElements.UBICACION_COMPLETA),
        Click.on(ReservaElements.BTN_GUARDAR_CONTINUAR));
    //PAGE 3
    actor.attemptsTo(IngresarJugadores.delInder(), Click.on(ReservaElements.BTN_GUARDAR_CONTINUAR));
    //PAGE 4
    actor.attemptsTo(Click.on(ReservaElements.BTN_GUARDAR_CONTINUAR));
  }
}
