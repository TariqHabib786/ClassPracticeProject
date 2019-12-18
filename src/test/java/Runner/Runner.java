package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\thros\\eclipse-workspace\\cucumber-jvm-template\\src\\test\\resources\\My.PracticeProject.feature", glue="StepDefination")
public class Runner{
 
}