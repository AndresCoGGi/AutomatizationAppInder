package co.com.bancolombia.certificacion.appinder.model;

import java.util.HashMap;
import java.util.Map;

public class Jugadores {

  public static Map obtenerJugadoresSantiago() {
    Map<String, String> jugadoresSantiago = new HashMap<String, String>();
    jugadoresSantiago.put("15655233", "Cédula de Ciudadanía");
    jugadoresSantiago.put("98732011", "Cédula de Ciudadanía");
    jugadoresSantiago.put("98644438", "Cédula de Ciudadanía");
    jugadoresSantiago.put("71681947", "Cédula de Ciudadanía");
    jugadoresSantiago.put("1039631461", "Cédula de Ciudadanía");
    jugadoresSantiago.put("15672611", "Cédula de Ciudadanía");
    jugadoresSantiago.put("71263817", "Cédula de Ciudadanía");
    jugadoresSantiago.put("1128267443", "Cédula de Ciudadanía");
    jugadoresSantiago.put("98642377", "Cédula de Ciudadanía");
    System.out.println("Tamaño despues de añadir los elementos : " + jugadoresSantiago.size());
    return jugadoresSantiago;
  }

  public static HashMap obtenerJugadoresAndres() {
    HashMap jugadoresAndres = new HashMap();
    jugadoresAndres.put("Pasaporte", "39370322");
    jugadoresAndres.put("Cédula de Ciudadanía", "98553671");
    jugadoresAndres.put("Cédula de Ciudadanía", "98716701");
    jugadoresAndres.put("Cédula de Ciudadanía", "98216544");
    jugadoresAndres.put("Cédula de Ciudadanía", "98712618");
    jugadoresAndres.put("Cédula de Ciudadanía", "1017178720");
    jugadoresAndres.put("Cédula de Ciudadanía", "71266606");
    jugadoresAndres.put("Cédula de Ciudadanía", "1013536502");
    jugadoresAndres.put("Cédula de Ciudadanía", "98572088");
    return jugadoresAndres;
  }


}
