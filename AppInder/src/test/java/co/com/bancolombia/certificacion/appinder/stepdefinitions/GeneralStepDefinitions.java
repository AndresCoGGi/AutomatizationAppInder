package co.com.bancolombia.certificacion.appinder.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.bancolombia.certificacion.appinder.util.drivers.MyDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

public class GeneralStepDefinitions {

  @SuppressWarnings("unchecked")
  public void setUp() {
    setTheStage(new Cast());
    theActorCalled("Andres");
    theActorInTheSpotlight()
        .can(BrowseTheWeb.with(MyDriver.web().inThePage("https://simon.inder.gov.co/admin/login")));
  }

}
