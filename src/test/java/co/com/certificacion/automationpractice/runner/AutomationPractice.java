package co.com.certificacion.automationpractice.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automation_practice.feature",
        glue = "co.com.certificacion.automationpractice.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)


public class AutomationPractice {


}
