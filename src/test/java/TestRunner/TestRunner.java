package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(io.cucumber.core.options.CucumberOptionsAnnotationParser.CucumberOptions.class)//
@CucumberOptions(features="Features\\Newuser.feature", glue="StepDefinition")
public class TestRunner {
		

}
