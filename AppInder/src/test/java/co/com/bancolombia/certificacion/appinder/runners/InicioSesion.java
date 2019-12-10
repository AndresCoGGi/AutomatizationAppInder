package co.com.bancolombia.certificacion.appinder.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature"
    , glue = "co.com.bancolombia.certificacion.appinder.stepdefinitions"
    , snippets = SnippetType.CAMELCASE)

public class InicioSesion {

}
