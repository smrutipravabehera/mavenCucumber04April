package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
					features= {"features"},
					glue = {"com.facebook.step"},
					tags = "@SignUp",
					plugin = "pretty",
					monochrome = true, dryRun = false
		)

public class TestRunner {

}
