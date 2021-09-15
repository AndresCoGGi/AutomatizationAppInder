package co.com.bancolombia.certificacion.appinder.tasks;

import static co.com.bancolombia.certificacion.appinder.userinterface.ReservaElements.DOCUMENTO_ENCONTRADO;
import static co.com.bancolombia.certificacion.appinder.userinterface.ReservaElements.TIPO_DOCUMENTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.bancolombia.certificacion.appinder.model.Jugadores;
import co.com.bancolombia.certificacion.appinder.userinterface.ReservaElements;

import java.util.Iterator;
import java.util.Map;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IngresarJugadores implements Task {

    public static IngresarJugadores delInder() {
        return Tasks.instrumented(IngresarJugadores.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int contadorJugadores = 1;
        Map jugadores;
        if (actor.recall("USUARIO").equals("1020459879")) {
            System.out.println("Jugadores Andres");
            jugadores = Jugadores.obtenerJugadoresAndres();
        } else {
            System.out.println("Jugadores Santiago");
            jugadores = Jugadores.obtenerJugadoresSantiago();
        }
        System.out.println("Tamaño: " + jugadores.size());
        for (Iterator it = jugadores.keySet().iterator(); it.hasNext(); ) {
            String numeroDocumento = (String) it.next();
            String tipoDocumento = (String) jugadores.get(numeroDocumento);
            String contJugadores = String.valueOf(contadorJugadores);
            System.out.println("Tipo :" + tipoDocumento);
            System.out.println("COntador :" + contJugadores);
            actor.attemptsTo(Scroll.to(ReservaElements.AGREGAR_NUEVO_JUGADOR), Click.on(ReservaElements.AGREGAR_NUEVO_JUGADOR),
                    Click.on(TIPO_DOCUMENTO.of(contJugadores, tipoDocumento)),
                    Click.on(ReservaElements.NRO_DOCUMENTO_BTN.of(contJugadores)),
                    Enter.theValue(numeroDocumento).into(ReservaElements.NUMERO_DOCUMENTO_INPUT),
                    WaitUntil.the(ReservaElements.NUMERO_DOCUMENTO_INPUT, isVisible()),
                    Click.on(DOCUMENTO_ENCONTRADO));
            contadorJugadores++;
        }
    }
}
