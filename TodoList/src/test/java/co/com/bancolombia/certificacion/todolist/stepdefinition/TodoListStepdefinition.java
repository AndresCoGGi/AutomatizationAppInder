package co.com.bancolombia.certificacion.todolist.stepdefinition;

import co.com.bancolombia.certificacion.todolist.tasks.AddItem;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class TodoListStepdefinition {

  @Managed(driver = "chrome")
  WebDriver herBrowser;
  Actor baby = Actor.named("my baby");

  @Before
  public void setUp(){
    baby.can(BrowseTheWeb.with(herBrowser));
  }

  @Given("^i entered into ToDoList page$")
  public void iEnteredIntoToDoListPage() {
    baby.wasAbleTo(Open.url("http://todomvc.com/examples/angular2/"));
  }

  @When("^i add (.*) item to market$")
  public void iAddAItemToMarket(String item) {
    baby.attemptsTo(AddItem.inMarket(item));
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Then("^i see the item is added successfully$")
  public void iSeeTheItemIsAddedSuccessfully() {

  }


}
