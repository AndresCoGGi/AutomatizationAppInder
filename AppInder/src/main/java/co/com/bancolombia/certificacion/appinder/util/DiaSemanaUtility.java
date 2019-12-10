package co.com.bancolombia.certificacion.appinder.util;

public class DiaSemanaUtility {

  private DiaSemanaUtility() {

  }

  public static String obtenerDiaSemana(String dia) {
    String diaSemana;
    switch (dia) {
      case "Lunes":
        diaSemana = "0";
        break;
      case "Martes":
        diaSemana = "1";
        break;
      case "Miercoles":
        diaSemana = "2";
        break;
      case "Jueves":
        diaSemana = "3";
        break;
      case "Viernes":
        diaSemana = "4";
        break;
      case "Sabado":
        diaSemana = "5";
        break;
      case "Domingo":
        diaSemana = "6";
        break;
      default:
        throw new IllegalArgumentException("Dia de la semana invalido: " + dia);
    }
    return diaSemana;
  }

  public static String aumentarDia(String diaSemanaActual){
    String diaSemanaNuevo;
    switch (diaSemanaActual) {
      case "Lunes":
        diaSemanaNuevo = "Martes";
        break;
      case "Martes":
        diaSemanaNuevo = "Miercoles";
        break;
      case "Miercoles":
        diaSemanaNuevo = "Jueves";
        break;
      case "Jueves":
        diaSemanaNuevo = "Viernes";
        break;
      case "Viernes":
        diaSemanaNuevo = "Sabado";
        break;
      case "Sabado":
        diaSemanaNuevo = "Domingo";
        break;
      case "Domingo":
        diaSemanaNuevo = "Lunes";
        break;
      default:
        throw new IllegalArgumentException("Dia de la semana invalido: " + diaSemanaActual);
    }
    return diaSemanaNuevo;
  }

}
