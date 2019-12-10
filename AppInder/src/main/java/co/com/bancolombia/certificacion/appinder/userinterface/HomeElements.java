package co.com.bancolombia.certificacion.appinder.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeElements {

  public static final Target BTN_REGISTRO = Target.the("Boton de registro")
      .locatedBy("//a[contains(@href,'registro')]");
  public static final Target TIPO_DOCUMENTO = Target.the("Tipo de documento")
      .locatedBy("//span[@id='select2-chosen-2']");
  public static final Target NUMERO_DOCUMENTO = Target.the("Numero de documento")
      .locatedBy("//input[@id='documento']");
  public static final Target CONTRASENIA = Target.the("Contrasenia")
      .locatedBy("//input[@id='password']");
  public static final Target BTN_ENTRAR = Target.the("Btn entrar")
      .locatedBy("//button[@class='btn btnVerde']");
  public static final Target INCIO_SESION_EXITOSO = Target.the("Inicio de sesion exitoso")
      .locatedBy(
          "//li[@class='dropdown user-menu menu-usuario-formato']//a[@class='dropdown-toggle']");

  private HomeElements() {
  }
}
