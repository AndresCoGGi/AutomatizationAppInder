package co.com.bancolombia.certificacion.todolist.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/todolist.feature",
    glue = "co.com.bancolombia.certificacion.todolist.stepdefinition",
    tags = "@Crear",
    snippets = SnippetType.CAMELCASE)

public class TodoListRunner {

}
