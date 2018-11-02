
package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/java/functionalTests/End2End_Tests.feature",
        glue = "stepDefinitions"
)
public class TestRunner {
}