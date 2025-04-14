package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {
		"src/test/resources/Features/login.feature",
		"src/test/resources/Features/opemrs.feature",
		"src/test/resources/Features/luma.feature"},
glue= {"Cucumber"},plugin= {"pretty","html:target/htmlreport.html"})

public class Testrunner extends AbstractTestNGCucumberTests  {



}
