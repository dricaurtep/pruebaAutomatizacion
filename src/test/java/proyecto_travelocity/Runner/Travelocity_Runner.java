package proyecto_travelocity.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
features = "src/test/resources/features/Travelocity/Travelocity.feature", 
tags = " @BuscarHotel", 
glue = "proyecto_travelocity.Definitions",
snippets = SnippetType.CAMELCASE)

public class Travelocity_Runner {

}
