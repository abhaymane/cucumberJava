package StepsDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="D:\\Mavan\\cucumberWithSelenium\\src\\test\\resources\\Features\\hooks.feature",//the path of feature file
glue={"StepsDefinition"},//the path of step definition file
plugin= {"pretty","html:target/cucumber-html-report","json:target/cucumber-json-report.json","junit:target/cucumber-report.xml"}
,monochrome=true,//display the console output in proper readable format
stepNotifications = true,//display the testSteps in junit console
//strict=true,//it will check if any step is not define in step definition file
dryRun=false//to check the mapping is proper between feature file and step def file
//tags = "@SmokeTest and @End2End" 
)
public class TestRunner {

}
