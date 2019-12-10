package co.com.bancolombia.certificacion.appinder.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ReservaElements {

  public static final Target ESCENARIOS_DEPORTIVOS = Target.the("Escenarios deportivos")
      .locatedBy("//li//span[text()='Escenarios Deportivos']");
  public static final Target RESERVA = Target.the("Reserva")
      .locatedBy("//li//a[@href='/admin/logic/reserva/list']");
  public static final Target AGREGAR_NUEVO = Target.the("Agregar nuevo")
      .locatedBy("//li//a[@href='/admin/logic/reserva/paso1/0']");
  public static final Target BARRIO = Target.the("Barrio")
      .locatedBy("//div[@id='s2id_escenario_deportivo_barrio']");
  public static final Target ESCENARIO_DEPORTIVO = Target.the("Escenario deportivo")
      .locatedBy("//div[@id='s2id_escenario_deportivo']//span[contains(@id,'select2-chosen')]");
 public static final Target DISCIPLINA_CHECKBOX = Target.the("Disciplina")
      .locatedBy("(//div[@class='iradio_square-blue'])[1]");
  public static final Target DISCIPLINA_CAMPO = Target.the("Disciplina campo")
      .locatedBy("//span[@id='select2-chosen-16']");
  public static final Target LOADER = Target.the("Loader")
      .locatedBy("//DIV[@id='select2-drop-mask']");
  public static final Target FECHA_INICIO_INPUT = Target.the("Fecha inicio")
      .locatedBy("//input[@id='fechaInicio']");
  public static final Target MES_LABEL = Target.the("Mes de la reserva")
      .locatedBy("//th[text()='{0}']");
  public static final Target BTN_NEXT = Target.the("Boton next")
      .locatedBy("(//th[@class='next'])[1]");
  public static final Target DIA = Target.the("Dia de reserva")
      .locatedBy("(//td[@class='day' and text()='{0}'])[1]");
  public static final Target JORNADA = Target.the("Jornada")
      .locatedBy("//div[@id='s2id_reserva_jornada']//a//span[@id]");
  public static final Target HORA_INICIO = Target.the("Hora inicio")
      .locatedBy("//input[@id='reserva_programaciones_{0}_inicioTarde']");
  public static final Target HORA_FIN = Target.the("Hora fin")
      .locatedBy("//input[@id='reserva_programaciones_{0}_finTarde']");
  public static final Target DISPONIBILIDAD = Target.the("Consultar disponibilidad")
      .locatedBy("//button[@onclick]");
  public static final Target ADVERTENCIA = Target.the("Advertencia")
      .locatedBy("//div[@class='swal2-icon swal2-warning']");
  public static final Target BTN_OK_ADVERTENCIA = Target.the("BOTON OK ADVERTENCIA")
      .locatedBy("//button[text()='OK']");
  public static final Target BTN_GUARDAR_CONTINUAR = Target.the("Continuar")
  .locatedBy("//button[@id='btnguardar']");
  //PAGE 2
  public static final Target UBICACION_COMPLETA = Target.the("Ubicacion completa")
      .locatedBy("//div[@id='divItemDivision']//div");
  //PAGE 3
  public static final Target AGREGAR_NUEVO_JUGADOR = Target.the("Agregar nuevo")
      .locatedBy("//i[text()=' Agregar nuevo']");
  public static final Target TIPO_DOCUMENTO = Target.the("Tipo documento")
      .locatedBy("//select[@id='usuarios_division_reserva_type_divisiones_0_divisionReservas_{0}_tipoIdentificacion']//option[contains(text(),'{1}')]");
 public static final Target NRO_DOCUMENTO_BTN = Target.the("Nro Documento")
      .locatedBy("//div[@id='s2id_fake_usuarios_division_reserva_type_divisiones_0_divisionReservas_{0}_numeroIdentificacion']");
  public static final Target NUMERO_DOCUMENTO_INPUT = Target.the("Numero de docmento input")
      .locatedBy("//ul//li/ancestor::div[1]//input[contains(@id,'search')]");
  public static final Target DOCUMENTO_ENCONTRADO = Target.the("Documento encontrado")
      .locatedBy("//span[contains(@class,'match')]");


  private ReservaElements() {

  }

}
