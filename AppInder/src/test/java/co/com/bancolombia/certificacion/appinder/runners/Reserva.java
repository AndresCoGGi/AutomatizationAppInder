package co.com.bancolombia.certificacion.appinder.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/reserva.feature"
    , glue = "co.com.bancolombia.certificacion.appinder.stepdefinitions"
    , snippets = SnippetType.CAMELCASE)
public class Reserva {

}
