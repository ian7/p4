package net.sonyx.p4.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Marcin on 05-Dec-16.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "net.sonyx.p4.tests"
)
public class RunCukeTest { // NOSONAR SonarLint does not know about @RunWith(Cucumber.class)
}