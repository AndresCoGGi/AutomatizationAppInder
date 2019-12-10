package co.com.bancolombia.certificacion.todolist.tasks;

import co.com.bancolombia.certificacion.todolist.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class AddItem implements Task {

  private String item;

  public AddItem(String item) {
    this.item = item;
  }

  public static AddItem inMarket(String item) {
    return Tasks.instrumented(AddItem.class, item);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.remember("ITEM", item);
    actor.attemptsTo(Enter.theValue(item).into(HomePage.ITEM_INPUT).thenHit(Keys.ENTER));
  }
}
