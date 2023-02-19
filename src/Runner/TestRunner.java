package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/Feature",
					glue= {"Pages","StepDefinition"},tags="@NHSInformation",
					monochrome = true,
						    plugin = {
				                    "pretty",
				                    "html:target/cucumber-reports/cucumber-pretty",
				                    "json:target/cucumber-reports/CucumberTestReport.json",
				                    "rerun:target/cucumber-reports/rerun.txt"
				            },
						    dryRun = true)

public class TestRunner {
	

}

	

