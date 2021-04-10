package co.com.bancolombia.certificacion.appinder.paradigma.funcional;

import java.util.ArrayList;
import java.util.List;

public class EjemploLambda {

  private static List<String> nombres;
  private static List<String> numeros;

  public static void llenarLista() {
    nombres = new ArrayList<>();
    nombres.add("Hernan");
    nombres.add("Juan David");
    nombres.add("Luis Guillermo");
    nombres.add("Santiago");
    nombres.add("Luis Fernando");
    nombres.add("Natalia");
    nombres.add("Gregorio");
    nombres.add("Catalina");
    nombres.add("Jairo");
    nombres.add("Andres");

    numeros = new ArrayList<>();
    numeros.add("1");
    numeros.add("2");
    numeros.add("3");
    numeros.add("4");
  }


  public static void imprimirLista() {
    nombres.forEach(System.out::println);
  }

  public static void eliminar() {
    nombres.removeIf(x -> x.equalsIgnoreCase("Natalia"));
  }

  public static void ordenarAscendente() {
    nombres.sort((x, y) -> x.compareTo(y));
  }

  public static void filtrar() {
    nombres.stream().filter(x -> x.startsWith("J")).forEach(System.out::println);
    System.out.println("------------------------");
    nombres.stream().filter(x -> x.contains("a")).forEach(System.out::println);
    System.out.println("------------------------");
    nombres.stream().filter(x -> x.startsWith("J")).map(String::toUpperCase)
        .forEach(System.out::println);
    System.out.println("------------------------");
  }

  public static void transformar() {
    numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
  }

  public static void limitar() {
    nombres.stream().limit(3).forEach(System.out::println);
  }

  public static void contar(){
    System.out.println(nombres.stream().filter(x->x.startsWith("J")).count());

  }

  public static void main(String[] args) {
    EjemploLambda.llenarLista();
    EjemploLambda.imprimirLista();
    System.out.println("------------------------");
    EjemploLambda.eliminar();
    EjemploLambda.imprimirLista();
    System.out.println("------------------------");
    EjemploLambda.ordenarAscendente();
    EjemploLambda.imprimirLista();
    System.out.println("------------------------");
    EjemploLambda.filtrar();
    System.out.println("------------------------");
    EjemploLambda.transformar();
    System.out.println("------------------------");
    EjemploLambda.limitar();
    System.out.println("------------------------");
    EjemploLambda.contar();
  }
}
