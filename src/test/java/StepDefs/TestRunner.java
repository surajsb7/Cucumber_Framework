package StepDefs;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefs"},
plugin = {"pretty","html:target/htmlReports/HealthCheck.html",
        "json:target/json/file.json",
        "junit:target/junit/file.xml",
       }
		)
public class TestRunner {

}
