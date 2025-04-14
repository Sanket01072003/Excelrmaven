package mini_project;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Features/luma.feature"},
glue= {"mini_project"},plugin= {"pretty","html:target/htmlreport1.html"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
