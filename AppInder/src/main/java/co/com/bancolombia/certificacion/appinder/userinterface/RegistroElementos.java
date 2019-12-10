package co.com.bancolombia.certificacion.appinder.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroElementos {

  public static final Target TIPO_PERSONA = Target.the("tipo persona")
      .locatedBy("//div[@id='s2id_tipopersona']");
  public static final Target TIPO_DOCUMENTO = Target.the("tipo documento")
      .locatedBy("//div[@id= 's2id_tipoidentificacion']");
  public static final Target NUMERO_IDENTIFICACION = Target.the("numero de identificacion")
      .locatedBy("//input[@id='numeroidentificacion']");
  public static final Target NOMBRES = Target.the("Nombres")
      .locatedBy("//input[@id='nombres']");
  public static final Target APELLIDOS = Target.the("Apellidos")
      .locatedBy("//input[@id='apellidos']");
  public static final Target SEXO = Target.the("Sexo")
      .locatedBy("//div[@id= 's2id_genero']");
  public static final Target CLAVE = Target.the("clave")
      .locatedBy("//input[@id='clave_uno']");
  public static final Target CONFIRMAR_CLAVE = Target.the("confirmar clave")
      .locatedBy("//input[@id='clave_dos']");
  public static final Target FECHA_NACIMIENTO = Target.the("Fecha Nacimiento")
      .locatedBy("//input[@id='fechanacimiento']");
  public static final Target CORREO_ELECTRONICO = Target.the("Correo Electronico")
      .locatedBy("//input[@id='correoelectronico']");
  public static final Target ESTRATO = Target.the("Estrato")
      .locatedBy("//span[@id='select2-chosen-28']");
  public static final Target OPCION_LISTA = Target.the("Opcion lista")
      .locatedBy("//div[text()='{0}']");
  public static final Target CHECK_HABEAS_DATA = Target.the("Sexo")
      .locatedBy("//input[@id='aceptahb']");
  public static final Target CHECK_TERMINOS = Target.the("Sexo")
      .locatedBy("//input[@id='aceptatc']");
  public static final Target BTN_GUARDAR = Target.the("Botón guardar")
      .locatedBy("//button[@id='registro_save']");
  public static final Target MUNICIPIO = Target.the("Municipio")
      .locatedBy("//div[@id='s2id_municipio']");
  public static final Target VEREDA = Target.the("Vereda")
      .locatedBy("(//div[@id='formulario_registro_direccionOcomuna']/div)[1]");
  public static final Target VEREDA_CAMPO = Target.the("Campo vereda")
      .locatedBy("//span[@id='select2-chosen-20']");
  public static final Target DIRECCION_UNO = Target.the("Direccion uno")
      .locatedBy("//span[@id='select2-chosen-21']");
  public static final Target DIRECCION_DOS = Target.the("Direccion dos")
      .locatedBy("//input[@id='formulario_registro_comuna_format_numero_via']");
  public static final Target DIRECCION_TRES = Target.the("Direccion tres")
      .locatedBy("//input[@id='formulario_registro_comuna_format_complemento']");
  public static final Target ACEPTAR_TERMINOS = Target.the("Aceptar terminos")
      .locatedBy("//input[@id='aceptatc']/parent::div");
  public static final Target  MENSAJE_EXITOSO = Target.the("Mensaje existoso")
      .locatedBy("//div[@class='alert alert-success alert-dismissable']");

  private RegistroElementos() {

  }

}
