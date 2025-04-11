package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Features/login.feature"},
glue= {"Cucumber"},plugin= {"pretty","html:target/htmlreport.html"})

public class Testrunner extends AbstractTestNGCucumberTests  {



}
