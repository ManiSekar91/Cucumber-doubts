package week6.day1.assignments.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/week6.day1.assignments.features", 
glue = "week6.day1.assignments.steps", monochrome = true, publish =true)

public class Runner extends AbstractTestNGCucumberTests {
	
}

