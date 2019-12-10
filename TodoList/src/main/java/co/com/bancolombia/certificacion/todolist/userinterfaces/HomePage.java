package co.com.bancolombia.certificacion.todolist.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

  public static final Target ITEM_INPUT =
      Target.the("item input").locatedBy("(//input)[1]");
  public static final Target ITEM_ADDED =
      Target.the("item added").locatedBy("//*[text()='{0}']");
}
