package co.com.bancolombia.certificacion.appinder.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.bancolombia.certificacion.appinder.interactions.SeleccionarEnLista;
import co.com.bancolombia.certificacion.appinder.model.UsuarioInder;
import co.com.bancolombia.certificacion.appinder.userinterface.RegistroElementos;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class RegistrarUsuario implements Task {

  private List<UsuarioInder> datosUsuario;

  public RegistrarUsuario(List<UsuarioInder> datosUsuario) {
    this.datosUsuario = datosUsuario;
  }

  public static RegistrarUsuario conDatos(List<UsuarioInder> datosUsuario) {
    return Tasks.instrumented(RegistrarUsuario.class, datosUsuario);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(SeleccionarEnLista.opcion(datosUsuario.get(0).getTipoPersona(),
        RegistroElementos.TIPO_PERSONA), SeleccionarEnLista
            .opcion(datosUsuario.get(0).getTipoDocumento(), RegistroElementos.TIPO_DOCUMENTO),
        Enter.theValue(datosUsuario.get(0).getNumeroIdentificacion())
            .into(RegistroElementos.NUMERO_IDENTIFICACION),
        Enter.theValue(datosUsuario.get(0).getNombre()).into(RegistroElementos.NOMBRES),
        Enter.theValue(datosUsuario.get(0).getApellido()).into(RegistroElementos.APELLIDOS),
        SeleccionarEnLista.opcion(datosUsuario.get(0).getSexo(), RegistroElementos.SEXO),
        Enter.theValue(datosUsuario.get(0).getFechaNacimiento())
            .into(RegistroElementos.FECHA_NACIMIENTO),
        Enter.theValue(datosUsuario.get(0).getClave()).into(RegistroElementos.CLAVE),
        Enter.theValue(datosUsuario.get(0).getClave()).into(RegistroElementos.CONFIRMAR_CLAVE),
        SeleccionarEnLista.opcion(datosUsuario.get(0).getMunicipio(), RegistroElementos.MUNICIPIO),
        WaitUntil.the(RegistroElementos.VEREDA, isVisible()),
        Click.on(RegistroElementos.VEREDA),
        SeleccionarEnLista.opcion("Aguas Frias , Altavista", RegistroElementos.VEREDA_CAMPO),
        SeleccionarEnLista.opcion("Kilometro", RegistroElementos.DIRECCION_UNO),
        Enter.theValue("45#").into(RegistroElementos.DIRECCION_DOS),
        Enter.theValue("31").into(RegistroElementos.DIRECCION_TRES),
        SeleccionarEnLista.opcion(datosUsuario.get(0).getEstrato(), RegistroElementos.ESTRATO),
        Enter.theValue(datosUsuario.get(0).getCorreo()).into(RegistroElementos.CORREO_ELECTRONICO),
        Scroll.to(RegistroElementos.BTN_GUARDAR).andAlignToBottom(),
        WaitUntil.the(RegistroElementos.ACEPTAR_TERMINOS, isClickable()),
        Click.on(RegistroElementos.ACEPTAR_TERMINOS),
        Click.on(RegistroElementos.BTN_GUARDAR)
    );

  }
}
